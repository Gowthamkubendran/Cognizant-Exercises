/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARRISH
 */
public class Transaction {
    public static void main(String[] args) {
        AccountsDAO dao = new AccountsDAO();
        dao.transferMoney(101, 102, 500.00);
    }
}

