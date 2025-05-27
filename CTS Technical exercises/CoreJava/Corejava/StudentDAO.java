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

public class StudentDAO {

    public void insertStudent(Student student) {
        String sql = "INSERT INTO students (name, age) VALUES (?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {

            st.setString(1, student.getName());
            st.setInt(2, student.getAge());

            int rows = st.executeUpdate();
            System.out.println(rows + " student inserted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(Student student) {
        String sql = "UPDATE students SET name = ?, age = ? WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, student.getName());
            stmt.setInt(2, student.getAge());
            stmt.setInt(3, student.getId());

            int rows = stmt.executeUpdate();
            System.out.println(rows + " student updated successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

