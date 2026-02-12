package ExceptionHandling.SimpleExceptionDemo;

/*Assignment : 04
================
Financial Transaction Validation

Objective:
Write a Java program that validates and processes financial transaction data entered by a user.
Use a multi-catch block to handle exceptions related to input validation and processing.

Instructions:
-------------
-> Create a BLC class named FinancialTransaction.

-> Implement a processTransaction method that:
   Method name : processTransaction
   Access Modifiers : public
   Return type : void
   Parameters : double, long

   Accepts user input for transaction details such as transaction amount and account number.
   Validate the transaction amount and account number.
   Throw an IllegalArgumentException if the transaction amount is negative or zero. otherwise print appropriate messages for successful transaction

-> Uses a multi-catch block to handle exceptions:
   NumberFormatException for invalid numeric inputs.
   IllegalArgumentException for invalid transaction amount (negative or zero).
   RuntimeException for other unexpected errors during processing.

-> Implement the main method in an ELC class.

   Create an instance of FinancialTransaction.
   Prompt the user to input transaction details.
   Call the processTransaction method with user inputs and test different scenarios.



TEST CASE 1 :
--------------
Transaction amount: 500
Account number: 1234567890
Expected Output:
Processing transaction...
Transaction successful: Amount Rs.500.0 transferred to account 1234567890


TEST CASE 2 :
--------------
Transaction amount: -100
Account number: 9876543210
Expected Output:
Error processing transaction: Transaction amount must be positive.


TEST CASE 3 :
--------------
Transaction amount: abc
Account number: 4567890123
Expected Output:
Invalid input: Please enter a valid number for transaction amount.*/

// BLC class
class FinancialTransaction {

    // Method to process transaction with validation
    public void processTransaction(double amount, long accountNumber) {
        // Validate transaction amount
        if (amount <= 0) {
            throw new IllegalArgumentException("Transaction amount must be positive.");
        }

        // Validate account number (basic validation - should be positive and at least 10 digits)
        if (accountNumber <= 0) {
            throw new IllegalArgumentException("Invalid account number.");
        }

        // If validation passes, process the transaction
        System.out.println("Processing transaction...");
        System.out.println("Transaction successful: Amount Rs." + amount + " transferred to account " + accountNumber);
    }
}

// ELC class
public class FinancialTransactionDemo {
    public static void main(String[] args) {
        // Create instance of FinancialTransaction
        FinancialTransaction transaction = new FinancialTransaction();

        // Prompt user for inputs
        try {
            // Read transaction amount
            System.out.print("Transaction amount: ");
            String amountStr = IO.readln();

            // Read account number
            System.out.print("Account number: ");
            String accountStr = IO.readln();

            // Parse inputs - may throw NumberFormatException
            double amount = Double.parseDouble(amountStr);
            long accountNumber = Long.parseLong(accountStr);

            // Process the transaction - may throw IllegalArgumentException
            transaction.processTransaction(amount, accountNumber);

        }
        // Multi-catch block for handling multiple exceptions
        catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a valid number for transaction amount.");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error processing transaction: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        }
    }
}
