package Threads.InterThreadCommunication;

//Develop a program by using ITC, where two customers called Depositor and Drawer
//will deposit and withdraw the money respectively from the ATM machine.
//
//Create a BLC class called Account
//        Instance Variable :
//private int balance = 0; (Initial Balance is 0)
//
//Methods :
//        ---------
//        1)
//Create a synchronized method withdraw :
//Name of the method : withdraw
//modifier : public
//Parameter : int amount
//
//Inside this method write the logic to verify that current balance should not
//be less than withdraw amount by using while loop, if the current balance is
//less than withdraw amount then put the current thread into wait method.
//
//Inside the method write the logic to withdraw the amount if balance is
//not less than withdraw amount and print the updated balance.
//
//notify any other thread which are waiting on the same object for the lock.
//
//        2) Create a synchronized method deposit
//Name of the method : deposit
//modifier : public
//Parameter : int amount
//
//In this method write the logic to deposit the amount, print the updated
//balance, notify the waiting thread which is waiting for withdraw the
//amount.
//
//Create another BLC class Drawer which extends from Thread class
//Instance Variable :
//private Account account;  //HAS-A Relation
//
//Initialize the Object properties by using parameterized constructor.
//
//Override run() method :
//inside run method create an array variable of type int withdrawals which
//will accept multiple amount in int value.
//
//create a for each loop to accept these integer value one by one and pass these
//value to withdraw the amount. In each withdraw process you should have 1 sec
//waiting period.
//
//Create another BLC class Depositor which extends from Thread class
//Instance Variable :
//private Account account;  //HAS-A Relation
//
//Initialize the Object properties by using parameterized constructor.
//
//Override run() method :
//inside run method create an array variable of type int deposits which
//will accept multiple amount in int value.
//
//create a for each loop to accept these integer value one by one and pass these
//value to deposit the amount. In each deposit process you should have 1 sec
//waiting period.
//
//Create an ELC class ATMMachine, inside main method create object as per
//        requirement, start both the threads to see inter thread communication result


class Account {
    private int balance = 0;

    public synchronized void withdraw(int amount) {
        while (balance >= amount) {
            IO.println("Wait for balance");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        balance -= amount;
        IO.println("Account withdrawn: " + amount);
        IO.println("Account balance: " + balance);
        notify();
    }

    public synchronized void deposit(int amount) {

        balance += amount;
        IO.println("Account deposited: " + amount);
        IO.println("Account balance: " + balance);
        notify();
    }
}

class Drawer extends Thread{
    private Account account;

    public Drawer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        int[] arr = {200, 300, 500, 100};
        for(int i : arr){
            account.withdraw(i);
            try {
                wait(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Depositor extends Thread {
    private Account account;

    public Depositor(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        int[] arr = {5500, 1500, 1000, 200};

        for (int i : arr){
            account.deposit(i);
            IO.println("Deposited " + arr[i]);
            try{
                wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class ATMMachine {
    public static void main(String[] args) {
        Account account = new Account();

        Drawer drawer = new Drawer(account);
        Depositor depositor = new Depositor(account);

        drawer.setName("Drawer 1");
        depositor.setName("Depositor 1");

        drawer.start();
        depositor.start();
    }
}
