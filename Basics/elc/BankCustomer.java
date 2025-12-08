/*ELC Class
An ELC class BankCustomer is given with main method to call the method for performing business logic.

Take the input from Scanner class to initialize all the non static fields through
setCustomerDeatils() methods with proper validation.

Take one Infinite while loop [while(true){}], Under this loop take switch case to
perform various operation as shown in the below output.


Test cases for Output :
------------------------
Case 1 :
---------
===== Welcome to ICICI Bank =====
Enter Customer Name : Ravi
Enter Account Number : 12345
Enter Opening Balance : 10000

Customer account created successfully!  [setCustomerDetails()]


===== MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Display Customer Details
5. Exit
Enter your choice: 1
Enter deposit amount: 5000
Deposit successful! ₹5000.0 credited.

===== MENU =====  [//This menu should come through infinite loop]
1. Deposit
2. Withdraw
3. Check Balance
4. Display Customer Details
5. Exit
Enter your choice:


Case 2 :
----------
===== MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Display Customer Details
5. Exit
Enter your choice: 2
Enter withdrawal amount: 3000
Withdrawal successful! ₹3000.0 debited.

Case 3 :
---------
===== MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Display Customer Details
5. Exit
Enter your choice: 3
Current Balance: ₹12000.0

Case 4 :
----------
===== MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Display Customer Details
5. Exit
Enter your choice: 4
Customer [Name=Ravi, AccountNumber=12345, Balance=13000.0]

Case 5 :
---------

===== MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Display Customer Details
5. Exit
Enter your choice: 5
Thank you for banking with ICICI Bank!


Test cases for Wrong Input Validation :
----------------------------------------
Case 1:
---------
===== MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Display Customer Details
5. Exit
Enter your choice: 1
Enter deposit amount: -5000
Deposit amount should be greater than zero!

Case 2:
--------
===== Welcome to ICICI Bank =====
Enter Customer Name : Ravi
Enter Account Number : 1678
Enter Opening Balance : 10000

Customer account created successfully!

===== MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Display Customer Details
5. Exit
Enter your choice: 2
Enter withdrawal amount: 15000
You have insufficient balance!
*/


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
                    IO.println("Enter valid choice: [1-5]");
                    break;


            }
        }
    }
}
