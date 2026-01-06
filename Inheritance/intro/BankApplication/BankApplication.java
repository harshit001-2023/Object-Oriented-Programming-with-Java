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
        int choice = Integer.parseInt(IO.readln("Enter Choice [1/2/3]: "));
        String accountHolderName = IO.readln("Enter Account Holder Name: ");
        String accountNumber = IO.readln("Account Number: ");
        double balance = Double.parseDouble(IO.readln("Enter Bbalance: "));
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
