package Payable;

import java.time.LocalDate;
import java.util.List;

public class PaymentProcessor {
    public static void main(String[] args) {
        Payable[] payables = {
                new Freelancer("John Doe", 50.0, 80),
                new FullTimeEmployee("Jane Smith", 5000, 1000),
                new Contractor("Tech Solutions Inc.", 15000, 2500)
        };

        System.out.println("=== PAYMENT PROCESSING STARTED ===");
        for (Payable payable : payables) {
            System.out.println("\n" + payable.generatePaymentDetails());
            System.out.printf("Amount to pay: $%.2f%n", payable.calculatePayment());
            payable.displayPaymentConfirmation();
            System.out.println("----------------------");
        }
        System.out.println("=== PAYMENT PROCESSING COMPLETED ===");
    }
}