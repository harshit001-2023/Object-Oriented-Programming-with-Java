/*
* 1. PaymentProcessing
Easy
100 points
• 130 min suggested
Problem Description

Develop an application for Payment Processing by using Method Overriding and Var args
concept.

Develop a super class Payment which contains 3 sub classes CreditCardPayment,
DebitCardPayment and UPI.

Coding Requirements :
---------------------
Create a BLC class Payment:

Method to process a payment:

Method Name: processPayment
Access Modifier: public
Return Type: void

Task: Print a generic payment processing message (e.g., "Processing payment").

Subclass CreditCardPayment:

Override processPayment method to print a credit card-specific message:

Method Name: processPayment
Access Modifier: public
Return Type: void

Task: Print a message for credit card payment (e.g., "Processing credit card payment").

Subclass DebitCardPayment:

Override processPayment method to print a debit card specific message:

Method Name: processPayment
Access Modifier: public
Return Type: void

Task: Print a message for Debit card payment (e.g., "Processing Debit Card payment").

Subclass UPIPayment:

Override processPayment method to print a UPI Payment-specific message:

Method Name: processPayment
Access Modifier: public
Return Type: void

Task: Print a message for UPI payment (e.g., "Processing UPI payment").


Create an ELC class PaymentProcessing in which take main method and take another
static method

Method :

Method to process multiple payments in a single transaction:

Method Name: paymentGateway()
Access Modifier: public
Return Type: void
Arguments: Payment... payments

Task: Loop through each payment and call the processPayment method.

Create instances of CreditCardPayment, DebitCardPayment, and UPIPayment.
Use polymorphism to call the processPayment method on each instance.

Examples
Example 1
Input:
Enter number of payments: 1
Choice: 1
Output:
Processing Credit Card payment
* */

package Inheritance.intro.PaymentProcessing;

class PaymentProcessing{
    void main(){
        var n = Integer.parseInt(IO.readln("Enter Number of Payments: "));
        IO.println("1) Credit Card\n2) Debit Card\n3) UPI\n");

        // Create array to store payments
        Payment[] payments = new Payment[n];

        // Read each payment choice
        for (int i = 0; i < n; i++) {
            var choice = Integer.parseInt(IO.readln("Enter your choice [1/2/3]: "));

            switch (choice) {
                case 1:
                    payments[i] = new CreditCardPayment();
                    break;
                case 2:
                    payments[i] = new DebitCardPayment();
                    break;
                case 3:
                    payments[i] = new UPI();
                    break;
                default:
                    IO.println("Invalid choice! Using Credit Card as default.");
                    System.exit(0);
            }
        }

        // Process all payments using paymentGateway
        paymentGateway(payments);
    }

    public static void paymentGateway(Payment... payments){
        for (Payment p : payments) {
            p.processPayment();
        }
    }
}


class Payment{
    // Parent method
    public void processPayment(){
        IO.println("Processing Payment");
    }
}

class CreditCardPayment extends Payment{
    // Overridden method
    @Override
    public void processPayment(){
        IO.println("Processing credit card Payment");
    }
}

class DebitCardPayment extends Payment{
    // Overridden method
    @Override
    public void processPayment(){
        IO.println("Processing debit card Payment");
    }
}

class UPI extends Payment{
    // Overridden method
    @Override
    public void processPayment(){
        IO.println("Processing UPI Payment");
    }
}