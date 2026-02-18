package Projects.ATM;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;

public class OptionMenu extends Accounts{
    DecimalFormat moneyFormat = new DecimalFormat("`$`###, ##0.00");

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    public void getLogin() throws IOException {
        int x = 1;
        do {
           try {
               data.put(952141, 191904);
               data.put(98947, 71976);

               IO.println("===============Welcome===============");
               IO.println("Enter your Customer Number: ");
               setCustomerNumber(Integer.parseInt(IO.readln()));

               IO.println("Enter your PIN Number: ");
               setPinNumber(Integer.parseInt(IO.readln()));
           } catch (Exception e) {
               IO.println("\n"+"Invalid Character(s). Only Number,"+"\n");
               x = 2;
           }
           int cn = getCustomerNumber();
           int pn = getPinNumber();
           if(data.containsKey(cn) && data.get(cn) == pn) getAccountType();
           else IO.println("\n"+"Wrong Customer number or Pin Number"+"\n");
        } while(x == 1);
    }

    public void getAccountType(){
        IO.println("Select the Account Type: ");
        IO.println("Type 1 - Checking Account");
        IO.println("Type 2 - Savings Account");
        IO.println("Type 3 - Exit");

        int selection = Integer.parseInt(IO.readln());

        switch (selection) {
            case 1:
                getChecking();
                break;

            case 2:
                getSavings();
                break;

            case 3:
                IO.println("Thank you for this ATM...\n");
                break;

            default:
                IO.println("Invalid Choice");
                getAccountType();
        }
    }

    public void getChecking(){
        IO.println("Checking Account: ");
        IO.println("Type 1 - View Balance");
        IO.println("Type 2 - Withdraw Funds");
        IO.println("Type 3 - Deposit Funds");
        IO.println("Type 4 - Exit");
        IO.println("Enter choice: ");

        int selection = Integer.parseInt(IO.readln());

        switch (selection){
            case 1:
                IO.println("Checking Account Balance: "+moneyFormat.format());
                getAccountType();
                break;

            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;

            case 4:
                IO.println("Thank you for the Transaction...");
                break;

            default:
                IO.println("Invalid Choice");
                getChecking();
        }
    }

    public void getSavings(){
        IO.println("Savings Account: ");
        IO.println("Type 1 - View Balance");
        IO.println("Type 2 - Withdraw Funds");
        IO.println("Type 3 - Deposit Funds");
        IO.println("Type 4 - Exit");
        IO.println("Enter valid choice: ");

        int selection = Integer.parseInt(IO.readln());

        switch (selection){
            case 1:
                IO.println("Savings Account Balance: "+moneyFormat.format(getSavingsAccountBalance()));
                getAccountType();
                break;

            case 2:
                getSavingsWithdrawInput();
                getAccountType();
                break;

            case 3:
                getSavingsDepositInput();
                getAccountType();
                break;

            case 4:
                IO.println("Thank you for the Transaction...");
                break;

            default:
                IO.println("Invalid Choice");
                getSavings();
        }
    }
}







