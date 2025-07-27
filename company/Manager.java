package company;

public class Manager extends Employee{
    //Constructor Manager calls all Employee variables
    public Manager(String emp_name, int id, String address) {
        super(emp_name, id, address);
    }

    //Overriding empDetails() method of Employee
    @Override
    public void empDetails() {
        super.empDetails();
    }

    //Method position displays Job Position of employee
    public void position() {
        System.out.println("Position: Manager");
    }
}
