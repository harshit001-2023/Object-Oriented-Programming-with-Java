/*
* 1. BankApplication
Easy
100 points
• 130 min suggested
Problem Description
Create a Bank Application project by using Method Overriding Concept to display
different kinds of account details and calculate interest rate on each different types
of account like saving account, Current account and Fixed deposit account.
Validate all the inputs properly and generate error message, if any input is not appropriate.

Create a BLC class called BankAccount
Fields :
accountHolderName String protected
accountNumber String protected
   balance double protected
   IFSC_CODE public static final String (Initialize the IFSC CODE at the time of declaration,
   will be common for all the Objects)

   Use a parameterized constructor to initialize all the fields, In this constructor provide
   error message, if inputs are not in valid format like (see test cases for more details)
a)Account holder name cannot be empty.
b)Account number cannot be empty.
c)Balance cannot be negative.

Methods :

1) Method Name     : calculateInterest()
Argument	   : No Argument
Return Type        : void
Access modifier    : public
In this method write a generic message regarding Bank interest Calculation.

2) Method Name     : displayAccountDetails()
Argument           : No Argument
Return Type        : void
Access modifier    : public
In this method display customer records [See the Test cases for more details in the below
of this question]

Create another BLC class SavingsAccount which is sub class of BankAccount

Field :
protected double interestRate = 4.0;

Take a parameterized constructor to initialize super class properties.

Method :

1) Method Name     : calculateInterest()
Argument           : No Argument
Return Type        : void
Access modifier    : public
In this method write a logic to calculate interest rate on Saving Account.

Create another BLC class CurrentAccount which is sub class of BankAccount

Field :
protected double overdraftLimit = 5000.0;

Take a parameterized constructor to initialize super class properties.

Method :

1) Method Name     : calculateInterest()
Argument           : No Argument
Return Type        : void
Access modifier    : public
In this method write a statement that Current accounts do not earn interest.

2) Method Name     : checkOverdraftLimit()
Argument           : No Argument
Return Type        : void
Access modifier    : public
In this method print overdraftLimit amount.

Create another BLC class FixedDepositAccount which is sub class of BankAccount

Field :
protected double interestRate = 6.5;
    depositTerm int protected;

    Take a parameterized constructor to initialize super class and current class properties.
    Validate the input deposit term with error message, depositTerm can't be negative.

Method :

1) Method Name     : calculateInterest()
Argument           : No Argument
Return Type        : void
Access modifier    : public
In this method write the logic to calculate the interest amount on FixedDeposit account.

Create an ELC class BankApplication with main method to test this application. Write
Switch case with Scanner class to Test as shown in the below Test Cases.

Examples
Example 1
Input:
Please select the Account Type :
        1) Saving Account
        2) Current Account
        3) Fixed Deposit Account
   Please enter the type of account you want to open : [1/2/3]
   2
   Enter account Holder Name :Scott
   Enter account Number :675456789765
   Enter the Amount :12000
Output:
Account Holder: Scott
   Account Number: 675456789765
   Balance RS :12000.0
   IFSC CODE :SBIHYD151285
   Current accounts do not earn interest.
   Overdraft limit RS :5000.0*/

package Inheritance.intro.BankApplication;

class BankAccount{
    protected String accountHolderName;
    protected String accountNumber;
    protected double balance;
    public static final String IFSC_CODE = "SBIHYD151285";

    public BankAccount(String accountHolderName, String accountNumber, double balance){
        if(accountHolderName.equals("null") || accountHolderName.length() <= 0){
            IO.println("Account Holder Name Cannot be empty or null.");
            System.exit(0);
        }
        if(accountNumber.equals("null") || accountNumber.length() <= 0){
            IO.println("Account Number should not be empty or null.");
            System.exit(0);
        }
        if(balance <= 0.0){
            IO.println("Balance cannot be negative.");
            System.exit(0);
        }
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void calculateInterest(){
    }

    public void displayAccountDetails(){
        IO.println("Account Holder: "+accountHolderName);
        IO.println("Account Number: "+accountNumber);
        IO.println("Balance RS :"+balance);
        IO.println("IFSC CODE :"+IFSC_CODE);
    }
}

class SavingsAccount extends BankAccount{
    protected double interestRate;

    public SavingsAccount(String accountHolderName, String accountNumber, double balance){
        super(accountHolderName, accountNumber, balance);
        this.interestRate = 4.0;
    }

    @Override
    public void calculateInterest(){
        IO.println("Savings Account Interest RS :"+(balance*interestRate)/100);
    }
}

class CurrentAccount extends BankAccount{
    protected double overDraftLimit;

    public CurrentAccount(String accountHolderName, String accountNumber, double balance){
        super(accountHolderName, accountNumber, balance);
        this.overDraftLimit = 5000.0;
    }

    @Override
    public void calculateInterest(){
        IO.println("Current accounts do not earn interest.");
        chechOverDraftLimit();
    }

    public void chechOverDraftLimit(){
        IO.println("Overdraft limit RS :"+overDraftLimit);
    }
}

class FixedDepositAccount extends BankAccount{
    protected double interestRate = 6.5;
    protected int depositTerm;

    public FixedDepositAccount(String accountHolderName, String accountNumber, double balance, int depositTerm){
        super(accountHolderName, accountNumber, balance);
        if(depositTerm <= 0){
            IO.println("Deposit term must be positive.");
            System.exit(0);
        }
        this. interestRate = 6.5;
        this.depositTerm = depositTerm;
    }

    @Override
    public void calculateInterest(){
        IO.println("Fixed Deposit Interest for "+depositTerm+" years RS :"+((balance*interestRate)/100)*depositTerm);
    }
}

public class BankApplication{
    void main(){
        IO.println("Please select the Account Type :\n" +
                "        1) Saving Account\n" +
                "        2) Current Account\n" +
                "        3) Fixed Deposit Account");
        int choice = Integer.parseInt(IO.readln("Please enter the type of account you want to open : [1/2/3]"));
        String accountHolderName = IO.readln("Enter Account Holder Name: ");
        String accountNumber = IO.readln("Account Number: ");
        double balance = Double.parseDouble(IO.readln("Enter Balance: "));
        BankAccount  bankAccount = null;


        switch(choice){
            case 1:
                bankAccount = new SavingsAccount(accountHolderName, accountNumber, balance);
                bankAccount.displayAccountDetails();
                bankAccount.calculateInterest();
                break;

            case 2:
                bankAccount = new CurrentAccount(accountHolderName, accountNumber, balance);
                bankAccount.displayAccountDetails();
                bankAccount.calculateInterest();
                break;

            case 3:
                int depositTerm = Integer.parseInt(IO.readln("Enter Deposit Terms : "));
                bankAccount = new FixedDepositAccount(accountHolderName, accountNumber, balance, depositTerm);
                bankAccount.displayAccountDetails();
                bankAccount.calculateInterest();
                break;

            default:
                IO.println("Invalid choice!");
                break;
        }
    }
}
