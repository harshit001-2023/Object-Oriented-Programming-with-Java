package Payable;

/**
 * Represents a full-time employee with salary and benefits
 */
public class FullTimeEmployee implements Payable {
    private String name;
    private double monthlySalary;
    private double bonus;

    public FullTimeEmployee(String name, double monthlySalary, double bonus) {
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }

    @Override
    public double calculatePayment() {
        return monthlySalary + bonus;
    }

    @Override
    public String generatePaymentDetails() {
        return String.format("Employee: %s\nSalary: $%.2f\nBonus: $%.2f\nTotal: $%.2f",
                name, monthlySalary, bonus, calculatePayment());
    }
}
