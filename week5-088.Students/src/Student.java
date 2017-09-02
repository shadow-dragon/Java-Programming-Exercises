/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shadow_dragon
 */
public class Student {
    private String student;
    private String studentNumber;
       
    public Student (String name, String studentNumber) {
        String Number = "" + studentNumber;
        this.student = name;
        this.studentNumber = Number;
    }
    
    public String getName () {
        return this.student;
    }
    
    public String getStudentNumber () {
        return this.studentNumber;
    }
    
    public String toString () {
        return student + " (" + studentNumber + ")";
    }
    
}

