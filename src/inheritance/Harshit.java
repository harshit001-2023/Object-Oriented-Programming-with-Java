package src.inheritance;

public class Harshit extends Student{
    String name;
    String address;

    //Extended Student class and created a constructor from Student class
    public Harshit(String name, String department, int rollNumber, String address) {
        super(name, department, rollNumber);
        this.name = name;
        this.address= address;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Name is "+name);
        System.out.println("Department is "+department);
        System.out.println("Address "+address);

    }
}
