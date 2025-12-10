package Basics.blc;

public class Employee1 {
    private String firstName;
    private String lastName;
    private int employeeId;
    private double salary;
    private int NoOfProject;

    public Employee1(String firstName, String lastName, int employeeId, double salary, int NoOfProject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.salary = salary;
        this.NoOfProject = NoOfProject;

        if (employeeId <= 0) {
            System.err.println("Enter valid Employee Id.");
            System.exit(0);
        }
        else if (salary <= 0) {
            System.err.println("Salary can't be 0 or less.");
            System.exit(0);
        }
        else if (NoOfProject < 0){
            System.err.println("Number of project cannot be Negative.");
        }
    }

    public void calculateSalary(){
        if (NoOfProject >= 5 && NoOfProject < 10) {
            IO.println("Updated salary "+(salary += 5000));
        }
        else if (NoOfProject >= 10 && NoOfProject <= 20) {
            IO.println("Updated salary "+(salary += 10000));
        }
        else if (NoOfProject > 20) IO.println("Updated salary "+(salary += 15000));
        else if(NoOfProject > 0 && NoOfProject < 5) IO.println("Do more project to get Incremented Salary, Salary not updated "+salary);
    }
}
