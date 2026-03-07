/*3. ReverseByUsingListIterator
Easy
100 points
• 120 min suggested
Problem Description
To write a Java program to iterate elements of an ArrayList in reverse order using ListIterator interface methods with a separate class.

In a bank ATM system, every transaction (deposit, withdrawal, payment) is stored in an ArrayList in the order it occurs.
When a customer requests a mini statement, the ATM should display the most recent transactions first.

To achieve this, the program uses the ListIterator interface to iterate the ArrayList in reverse order and display the latest transactions at the top.

Import packages.

Create a separate class called TransactionHistory.

Create a method displayReverse() that accepts an ArrayList<?>. as a parameter

Create the main class.

Create an ArrayList to store transactions.

Add transaction records to the list.

Create an object of TransactionHistory.

Call the displayReverse() method.

Examples
Example 1
Input:
Deposited ₹5000
Withdrawn ₹1000
Online Payment ₹700
Withdrawn ₹500
Output:
ATM Mini Statement (Latest First):
Withdrawn ₹500
Online Payment ₹700
Withdrawn ₹1000
Deposited ₹5000*/

import java.util.ArrayList;
import java.util.ListIterator;

void main(){

    ArrayList<String> list = new ArrayList<>();
    list.add(IO.readln());
    list.add(IO.readln());
    list.add(IO.readln());
    list.add(IO.readln());

    IO.println("ATM Mini Statement (Latest First):");
    TransactionHistory.displayReverse(list);

}


static class TransactionHistory {
    public static void displayReverse(ArrayList<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            IO.println(iterator.previous());
        }
    }
}