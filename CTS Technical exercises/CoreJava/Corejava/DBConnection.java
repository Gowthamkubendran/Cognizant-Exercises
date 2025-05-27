/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARRISH
 */
import java.sql.*;

public class DBConnection {
    private static final String url = "jdbc:mysql://localhost:3306/student_db";
    private static final String user = "root";
    private static final String pass = "Harrish@07";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, pass);
    }
}
