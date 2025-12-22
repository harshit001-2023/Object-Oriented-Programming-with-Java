package Inheritance;

public class Harshit extends Student{
    String name;
    String address;

    //Extended Student class and created a constructor from Student class
    public Harshit(String name, String department, int rollNumber, String address) {
        super(name, department, rollNumber);
        this.name = name;
        this.address= address;
    }

    //Implementing runtime polymorphism
    @Override
    public void showDetails(Student student) {
        super.showDetails();
        student.showRole(10);
        System.out.println("Name is "+name);
        System.out.println("Department is "+department);
        System.out.println("Address "+address);

    }
}
