/*Assignment 01 :
--------------
A BLC class named as Bank is given in which you need to write the code for performing the withdrawal and deposit process and also Checking current balance and displayDetail of the Customer (BlC class)

Coding requirements :
---------------------

Non static Fields [private access modifier]
-----------------------------------------------------------------------------------------
customerName:String
accountNumber:int
currentBalance:double

static Field(public access modifier, must be initialized at the time of declaration)
-----------------------------------------------------------------------------------------
bankName:String static
bankAddress:String static
bankIFSCCode:Stirng static
------------------------------------------------------------------------------------------
This BLC class contains 6 methods with the following specifications :
-------------------------------------------------------------------------------------------
Methods :
---------
1)
Method Name		: setCustomerDeatils()
Parameter		: 3 Parameters of type String, int and double(name, accNumber, balance)
Return Type		: void
Access modifier		: public

In this method with the help of parameters variables, initialize the non static fields.
If balance is negative OR zero, provide error message and exit from the program.

-----------------------------------------------------------------------------------------
2)
Method Name		: withdraw()
Parameter		: double amount
Return Type		: void
Access modifier		: public

In this method, If withdraw amount is greater than available balance than it should print
error message "You have insufficient balance" and exit from the program.

------------------------------------------------------------------------------------------
3)
Method Name		: deposit()
Parameter		: double amount
Return Type		: void
Access modifier		: public

In this method, If a cutsomer wants to deposit zero or -ve amount than it should provide error message and exit from the program.
---------------------------------------------------------------------------------------
4.
Method Name		: getCurrentBalance()
Parameter		: No parameter
Return Type		: double
Access modifier		: public

In this method, You should return Current balance.
------------------------------------------------------------------------------------------
5.
Method Name		: displayDetails()
Parameter		: No parameter
Return Type		: String
Access modifier		: public

In this method, We need to  return all the properties (non static field) in String format through this displayDetails() method in the below format :

Customer [Name=Ravi, AccountNumber=12345, Balance=13000.0]*/

package Basics.blc;


public class Bank {
    private String customerName;
    private int accountNumber;
    private double currentBalance;

    static String bankName;
    static String bankAddress;
    static String bankIFSCCode;

    public void setCustomerDetails(String name, int accNumber, int balance){
        customerName = name;
        accountNumber = accNumber;
        currentBalance = balance;

        if (currentBalance <= 0) {
            System.err.println("Enter more than zero.");
            System.exit(0);
        }
    }

    public void withdraw(double amount){
        if(amount < currentBalance) {
            System.err.println("You have insufficient balance");
            System.exit(0);
        } else {
            currentBalance = currentBalance - amount;
            IO.println("Withdrawal successful! ₹"+amount+" debited.");
        }
    }

    public void deposit(double amount){
        if (amount <= 0) {
            System.err.println("Amount should not be Zero or less than zero.");
            System.exit(0);
        } else {
            currentBalance = currentBalance + amount;
            IO.println("Deposited successful! ₹"+amount+" credited.");
        }
    }

    public double getCurrentBalance(){
        return currentBalance;
    }

    public String displayDetails(){
        return "Customer {" +
                "customerName='" + customerName + '\'' +
                ", accountNumber=" + accountNumber +
                ", currentBalance=" + currentBalance +
                '}';
    }





}
