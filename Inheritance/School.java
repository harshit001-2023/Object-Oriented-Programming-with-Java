package Inheritance;

public class School {
    protected String name;
    protected String department;

    //Constructor
    public School(String name, String department) {
        this.name = name;
        this.department = department;
    }

    //Method showDetails
    public void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);
    }
}