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

        if (currentBalance == 0) System.exit(0);
    }

    public void withdraw(double amount){
        if(amount > currentBalance) {
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
