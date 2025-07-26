package company;

public class Developer extends Employee{
    public Developer(String emp_name, int id, String address) {
        super(emp_name, id, address);
    }

    @Override
    public void empDetails() {
        super.empDetails();
    }


    public void position() {
        System.out.println("Position: Developer");
    }
}
