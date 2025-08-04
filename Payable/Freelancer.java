package Payable;

/**
 * Represents a freelancer who gets paid by the hour
 */
public class Freelancer implements Payable {
    private String name;
    private double hourlyRate;
    private double hoursWorked;

    public Freelancer(String name, double hourlyRate, double hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayment() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String generatePaymentDetails() {
        return String.format("Freelancer: %s\nHours: %.2f\nRate: $%.2f/hr\nTotal: $%.2f",
                name, hoursWorked, hourlyRate, calculatePayment());
    }
}