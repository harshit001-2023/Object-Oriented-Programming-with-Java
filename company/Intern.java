package company;

public class Intern extends Employee{
    public Intern(String emp_name, int id, String address) {
        super(emp_name, id, address);
    }

    public void position(){
        System.out.println("Position: Intern");
    }

    @Override
    public void empDetails() {
        super.empDetails();
    }
}
