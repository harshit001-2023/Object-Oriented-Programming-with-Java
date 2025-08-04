package Payable;

/**
 * Interface for entities that receive payments
 */
public interface Payable {
    /**
     * Calculates the payment amount
     * @return calculated payment amount
     */
    double calculatePayment();

    /**
     * Generates payment details report
     * @return formatted payment details
     */
    String generatePaymentDetails();

    /**
     * Default method to display payment confirmation
     */
    default void displayPaymentConfirmation() {
        System.out.println("Payment processed successfully");
    }
}

