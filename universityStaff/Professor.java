package universityStaff;

public class Professor extends Employee {
    public Professor(String name, String department, double monthlySalary) {
        super(name, department, "Professor", monthlySalary);
    }

    @Override
    public double calculateBonus() {
        return annualIncome * 0.10; // 10% bonus
    }

    @Override
    public void displayInfo() {
        calculateSalary();
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
        System.out.printf("Salary per Month: ₹%.2f | Annual Income: ₹%.2f | Bonus: ₹%.2f | Total Income: ₹%.2f%n",
                monthlySalary, annualIncome, calculateBonus(), (annualIncome+calculateBonus()));
    }
}