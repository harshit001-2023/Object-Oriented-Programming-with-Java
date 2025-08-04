package Payable;

import java.time.LocalDate;
import java.util.List;

public interface PaymentHistory {
    void recordPayment(double amount, LocalDate date);
    List<PaymentRecord> getPaymentHistory();
}