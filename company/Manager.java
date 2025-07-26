package company;

public class Manager extends Employee{
    public Manager(String emp_name, int id, String address) {
        super(emp_name, id, address);
    }

    @Override
    public void empDetails() {
        super.empDetails();
    }


    public void position() {
        System.out.println("Position: Manager");
    }
}
