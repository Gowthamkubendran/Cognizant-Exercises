/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARRISH
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountsDAO {

    public void transferMoney(int fromAccId, int toAccId, double amount) {
        String debit = "UPDATE accounts SET balance = balance - ? WHERE acc_id = ?";
        String credit = "UPDATE accounts SET balance = balance + ? WHERE acc_id = ?";

        try (Connection conn = DBConnection1.getConnection()) {
            conn.setAutoCommit(false);

            try(PreparedStatement debitSt = conn.prepareStatement(debit);
                PreparedStatement creditSt = conn.prepareStatement(credit))
            {
                debitSt.setDouble(1, amount);
                debitSt.setInt(2, fromAccId);
                int debitResult = debitSt.executeUpdate();

                creditSt.setDouble(1, amount);
                creditSt.setInt(2, toAccId);
                int creditResult = creditSt.executeUpdate();

                if (debitResult == 1 && creditResult == 1) {
                    conn.commit();
                    System.out.println("Transaction Successful!");
                } else {
                    conn.rollback();
                    System.out.println("Transaction Failed! Rolling back...");
                }

            } catch (SQLException ex) {
                conn.rollback();
                ex.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

