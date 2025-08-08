package universityStaff;

public abstract class Employee implements Staff {
    protected String name;
    protected String department;
    protected String designation;
    protected double monthlySalary;
    protected double annualIncome;

    public Employee(String name, String department, String designation, double monthlySalary) {
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateSalary() {
        annualIncome = monthlySalary * 12;
    }

    public abstract double calculateBonus();

    @Override
    public abstract void displayInfo();
}