package Payable;

import Payable.Contractor;

import java.util.Currency;
import java.util.List;

public class InternationalContractor extends Contractor implements InternationalPayment {
    private String iban;

    public InternationalContractor(String companyName, double projectFee,
                                   double expenses, String iban) {
        super(companyName, projectFee, expenses);
        this.iban = iban;
    }

    @Override
    public double convertCurrency(double amount, Currency targetCurrency) {
        // Implement actual conversion logic
        return amount * 0.85; // Example conversion rate
    }

    @Override
    public String getIBAN() {
        return iban;
    }

    @Override
    public Currency getSourceCurrency() {
        return null;
    }

    @Override
    public List<Currency> getSupportedCurrencies() {
        return List.of();
    }
}