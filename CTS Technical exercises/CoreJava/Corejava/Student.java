/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARRISH
 */
public class Student {
    int id;
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() 
    { 
        return id; 
    }
    public String getName() 
    { 
        return name; 
    }
    public int getAge() 
    { 
        return age; 
    }
}
