package Projects.ATM;

import java.text.DecimalFormat;

public class Accounts {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingsBalance = 0;

    DecimalFormat decimalFormat = new DecimalFormat("`$`###,##0.00");


    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public double calCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    public double calSavingsWithdraw(double amount){
        savingsBalance = (savingsBalance - amount);
        return savingsBalance;
    }

    public double calCheckingDeposit(double amount){
        checkingBalance = checkingBalance + amount;
        return checkingBalance;
    }

    public double calSavingsDeposit(double amount){
        savingsBalance = savingsBalance + amount;
        return savingsBalance;
    }

    public void getCheckingWithdrawInput(){
        IO.println("Checking Account Balance: "+decimalFormat.format(checkingBalance));
        IO.println("Enter Withdrawal Amount: ");
        double amount = Integer.parseInt(IO.readln());

        if((checkingBalance - amount) >= 0) {
            calCheckingWithdraw(amount);
            IO.println("New Checking Account Balance: "+decimalFormat.format(checkingBalance));
        }else IO.println("Balance cannot be Negative."+"\n");
    }

    public void getSavingsWithdrawInput(){
        IO.println("Savings Account Balance: "+decimalFormat.format(savingsBalance));
        IO.println("Enter Withdrawal Amount: ");
        double amount = Integer.parseInt(IO.readln());

        if((savingsBalance - amount) >= 0) {
            calSavingsWithdraw(amount);
            IO.println("New Savings Account Balance: "+decimalFormat.format(savingsBalance));
        }else IO.println("Balance cannot be Negative."+"\n");
    }

    public void getCheckingDepositInput(){
        IO.println("Checking Account Balance: "+decimalFormat.format(checkingBalance));
        IO.println("Enter Deposit Amount: ");
        double amount = Integer.parseInt(IO.readln());

        if((savingsBalance + amount) >= 0) {
            calCheckingDeposit(amount);
            IO.println("New Checking Account Balance: "+decimalFormat.format(checkingBalance));
        }else IO.println("Balance cannot be Negative."+"\n");
    }

    public void getSavingsDepositInput(){
        IO.println("Savings Account Balance: "+decimalFormat.format(savingsBalance));
        IO.println("Enter Deposit Amount: ");
        double amount = Integer.parseInt(IO.readln());

        if((savingsBalance + amount) >= 0) {
            calSavingsDeposit(amount);
            IO.println("New Savings Account Balance: "+decimalFormat.format(savingsBalance));
        }else IO.println("Balance cannot be Negative."+"\n");
    }
}