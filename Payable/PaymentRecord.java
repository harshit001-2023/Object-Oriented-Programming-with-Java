package Payable;

import java.time.LocalDate;

public record PaymentRecord(double amount, LocalDate date, String payeeName) {
    @Override
    public String toString() {
        return String.format("Payment of $%.2f to %s on %s", amount, payeeName, date);
    }
}