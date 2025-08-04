package Payable;

/**
 * Represents a contractor paid per project
 */
public class Contractor implements Payable {
    private String companyName;
    private double projectFee;
    private double expenses;

    public Contractor(String companyName, double projectFee, double expenses) {
        this.companyName = companyName;
        this.projectFee = projectFee;
        this.expenses = expenses;
    }

    @Override
    public double calculatePayment() {
        return projectFee + expenses;
    }

    @Override
    public String generatePaymentDetails() {
        return String.format("Contractor: %s\nProject Fee: $%.2f\nExpenses: $%.2f\nTotal: $%.2f",
                companyName, projectFee, expenses, calculatePayment());
    }

    @Override
    public void displayPaymentConfirmation() {
        System.out.println("Contractor payment processed. 1099 form will be issued.");
    }

    public double calculateTax(){
        return calculatePayment() * 0.15; // Example flat tax rate
    }
}
