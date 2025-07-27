package company;

public class Intern extends Employee{
    //Constructor Manager calls all Employee variables
    public Intern(String emp_name, int id, String address) {
        super(emp_name, id, address);
    }

    //Overriding empDetails() method of Employee
    public void position(){
        System.out.println("Position: Intern");
    }

    //Method position displays Job Position of employee
    @Override
    public void empDetails() {
        super.empDetails();
    }
}
