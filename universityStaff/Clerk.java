package universityStaff;

public class Clerk implements Staff{
    double monthlySalary;
    double annualIncome;
    String name;
    String department;
    final String designation;

    public Clerk(String name, String department, double monthlySalary) {
        this.name = name;
        this.department = department;
        designation = "Clerk";
        this.monthlySalary = monthlySalary;
    }

    //Salary Calculation formula for Annual Income = Monthly Salary * 12 Months
    @Override
    public void calculateSalary() {
        annualIncome = monthlySalary * 12;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);
        System.out.println("Designation: "+designation);
        System.out.println("Salary per Month is "+monthlySalary+" therefore Annual Income is "+annualIncome);
    }
}
