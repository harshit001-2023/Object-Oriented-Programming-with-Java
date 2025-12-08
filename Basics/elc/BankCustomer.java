package Basics.elc;

import Basics.blc.Bank;

import java.util.function.DoubleToLongFunction;

public class BankCustomer {
    static void main() {
        IO.println("===== Welcome to ICICI Bank =====");
        String customerName = IO.readln("Enter Customer Name : ");
        int accountNumber = Integer.parseInt(IO.readln("Enter Account Number : "));
        int openingBalance = Integer.parseInt(IO.readln("Enter Opening Balance : "));

        Bank bank = new Bank();
        bank.setCustomerDetails(customerName, accountNumber, openingBalance);


        while(true){
            IO.println("1. Deposit");
            IO.println("2. Withdraw");
            IO.println("3. Check Balance");
            IO.println("4. Display Customer Details");
            IO.println("5. Exit");
            int choice = Integer.parseInt(IO.readln("Enter your choice: "));
            switch (choice){
                case 1:
                    double amount = Double.parseDouble(IO.readln("Enter deposit amount : "));
                    bank.deposit(amount);
                    break;

                case 2:
                    double amt = Double.parseDouble(IO.readln("Enter Withdrawal amount : "));
                    bank.withdraw(amt);
                    break;

                case 3:
                    IO.println("Current Balance: "+bank.getCurrentBalance());
                    break;

                case 4:
                    IO.println(bank.displayDetails());
                    break;

                case 5:
                    IO.println("Thank you for banking with ICICI Bank!");
                    System.exit(0);
                    break;

                default:
                    IO.println("Enter valid choice: ");
                    break;


            }
        }
    }
}
