package Payable;

import java.util.Currency;
import java.util.List;

/**
 * Interface for handling international payments with currency conversion
 * and multi-currency support
 */
public interface InternationalPayment {
    /**
     * Converts payment amount to target currency
     * @param amount Payment amount in source currency
     * @param targetCurrency Currency to convert to
     * @return Converted amount in target currency
     * @throws UnsupportedCurrencyException if currency conversion not available
     */
    double convertCurrency(double amount, Currency targetCurrency)
            throws UnsupportedCurrencyException;

    /**
     * Gets the International Bank Account Number (IBAN)
     * @return Valid IBAN for the payee
     */
    String getIBAN();

    /**
     * Gets the payment's source currency
     * @return Currency of the original payment
     */
    Currency getSourceCurrency();

    /**
     * Gets list of supported currencies for conversion
     * @return List of supported Currency objects
     */
    List<Currency> getSupportedCurrencies();

    /**
     * Gets the SWIFT/BIC code for international transfers
     * @return Bank identifier code
     */
    default String getSwiftCode() {
        return "Not specified";
    }

    /**
     * Calculates international transfer fees
     * @param amount Transfer amount
     * @return Calculated fees
     */
    default double calculateTransferFees(double amount) {
        return Math.max(15.0, amount * 0.01); // $15 or 1% whichever is higher
    }

    /**
     * Exception for unsupported currency conversions
     */
    class UnsupportedCurrencyException extends Exception {
        public UnsupportedCurrencyException(String message) {
            super(message);
        }
    }
}