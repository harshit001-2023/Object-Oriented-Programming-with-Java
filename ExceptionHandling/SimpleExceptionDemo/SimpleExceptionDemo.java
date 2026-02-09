package ExceptionHandling.SimpleExceptionDemo;/*Ques : 1
=========

Exception and Messages

-> Write a program to create an ELC class SimpleExceptionDemo ,which contains main method.

-> This program should read two integer numbers for the variables a and b from console using Scanner class.

-> If you enter any other character except number (0 - 9) then the error is caught by InputMisMatchException object.

-> After that using following methods print the information about the error occurring causes in the console. getMessages(),  printStackTrace(), println(),  toString().



TEST CASE 1 :
-------------
Input :
Enter the first integer (a): 10
Enter the second integer (b): 20

Output:
You entered a = 10 and b = 20


TEST CASE 2 :
-------------
Input :
Enter the first integer (a): abc

Output:
getMessage():=> null

toString():=> java.util.InputMismatchException

println():=> InputMismatchException occurred. Please enter only integer numbers.

printStackTrace():=>
java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at com.testing.SimpleExceptionDemo.main(SimpleExceptionDemo.java:15)


TEST CASE 3 :
-------------
Enter the first integer (a): 10
Enter the second integer (b): abc

Output :
getMessage():=> null

toString():=> java.util.InputMismatchException

println():=> InputMismatchException occurred. Please enter only integer numbers.

printStackTrace():=>
java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at com.testing.SimpleExceptionDemo.main(SimpleExceptionDemo.java:18)*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class SimpleExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read first integer
            System.out.print("Enter the first integer (a): ");
            int a = scanner.nextInt();

            // Read second integer
            System.out.print("Enter the second integer (b): ");
            int b = scanner.nextInt();

            // If successful, print the values
            System.out.println("You entered a = " + a + " and b = " + b);

        } catch (InputMismatchException e) {
            // Handle the exception as specified
            System.out.println("getMessage():=> " + e.getMessage());
            System.out.println();
            System.out.println("toString():=> " + e.toString());
            System.out.println();
            System.out.println("println():=> InputMismatchException occurred. Please enter only integer numbers.");
            System.out.println();
            System.out.println("printStackTrace():=> ");
            e.printStackTrace();

        } finally {
            scanner.close();
        }
    }
}