package Basics.oop;

public class Account{
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double balance){
        if(accountNumber.equals("null")){
            IO.println("Error: Account number should not be empty.");
            System.exit(0);
        }
        else if(balance < 0) {
            IO.println("Error: Balance should not be negative.");
            System.exit(0);
        }

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String toString(){
        return "Account Number: "
                +accountNumber+"\nAccount Holder Name: "
                +accountHolderName+ "\nBalance: "+balance;
    }


    static void main(){
        String accountNumber = IO.readln();
        String accountHolderName = IO.readln();
        double balance = Double.parseDouble(IO.readln());
        Account account = new Account(accountNumber, accountHolderName, balance);
        IO.println("Account created successfully!");
        IO.println(account.toString());
    }
}
