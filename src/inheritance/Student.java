package src.inheritance;

import src.inheritance.School;

class Student extends School {
    private int rollNumber;

    public Student(String name, String department, int rollNumber) {
        super(name, department);
        this.rollNumber = rollNumber;
    }

    public void showRole(){
        showDetails();
        System.out.println("Role: Student");
        System.out.println("Roll No: "+rollNumber);
    }
    /// Applying concept of Method overloading
    public void showRole(int std){
        showRole();
        System.out.println("Student Name: "+std);
    }
}