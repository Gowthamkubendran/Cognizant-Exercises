/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARRISH
 */
public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        
        Student newStudent = new Student("Daniel", 19);
        dao.insertStudent(newStudent);

        Student updatedStudent = new Student(4, "Daniel Johnson", 21);
        dao.updateStudent(updatedStudent);
    }
}

