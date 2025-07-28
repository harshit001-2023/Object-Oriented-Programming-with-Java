package src.inheritance;

import src.inheritance.School;

abstract class Student extends School {
    //Applying Encalsulation concepts
    private int rollNumber;
    private String name;
    private int marks;

    //Student constructor
    public Student(String name, String department, int rollNumber) {
        super(name, department);
        this.rollNumber = rollNumber;
    }

    //Applied setter and getters for all private variables rollNumber, name and marks
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
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

    //Implementing runtime polymorphism
    public abstract void showDetails(Student student);
}