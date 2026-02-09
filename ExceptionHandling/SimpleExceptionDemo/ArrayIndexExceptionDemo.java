package ExceptionHandling.SimpleExceptionDemo;

/*2. ArrayIndexOutOfBoundExceptionDemo
Easy
100 points
• 125 min suggested
Problem Description

NOTE:-we can use Integer.parseInt(IO.readln());for this question
ArrayIndexOutOfBoundException
============================

-> Create a class named ArrayIndexExceptionDemo inside the package com.testing that contains the main method.

-> Inside the main method:

   Declare and initialize an integer array with 2 elements as follows:
   int a[] = new int[2];
   a[0] = 10;
   a[1] = 20;

-> Prompt the user to enter an index value using the Scanner class.

-> Try to print the value of the array element at the entered index.

-> If the user enters an index outside the valid range (i.e., anything other than 0 or 1), the program should catch the ArrayIndexOutOfBoundsException.

-> In the catch block, print the exception details using the following methods:

   getMessage()

   toString()

   printStackTrace()

Also, print a custom message using System.out.println() explaining that the user tried to access an invalid index.


TEST CASE 1 :
-------------

Input:
3

Output:
getMessage():=> Index 3 out of bounds for length 2

toString():=> java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2

println():=> You tried to access an invalid array index. Please check the index range.

printStackTrace():=>
java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
	at com.testing.ArrayIndexExceptionDemo.main(ArrayIndexExceptionDemo.java:12)



TEST CASE 2 :
-------------

Input :
2

Output :
getMessage():=> Index 2 out of bounds for length 2

toString():=> java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2

println():=> You tried to access an invalid array index. Please check the index range.

printStackTrace():=>
java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
	at com.testing.ArrayIndexExceptionDemo.main(ArrayIndexExceptionDemo.java:12)




TEST CASE 3 :
-------------

Input:
1

Output:
20


TEST CASE 4 :
-------------

Input:
0

Output:
10

Examples
Example 1
Input:
2
Output:
getMessage():=> Index 2 out of bounds for length 2

toString():=> java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2

println():=> You tried to access an invalid array index. Please check the index range.

printStackTrace():=>
java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
	at com.testing.ArrayIndexExceptionDemo.main(ArrayIndexExceptionDemo.java:12)*/

import java.util.Scanner;

public class ArrayIndexExceptionDemo {
    public static void main(String[] args) {
        // Initialize array with 2 elements
        int[] a = new int[2];
        a[0] = 10;
        a[1] = 20;

        Scanner scanner = new Scanner(System.in);

        try {
            // Read index from user
            System.out.print("Enter index: ");
            int index = Integer.parseInt(IO.readln()); // Using IO.readln() as per instruction

            // Try to access array element at given index
            int value = a[index];
            System.out.println(value);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Print exception details as specified in test cases
            System.out.println("getMessage():=> " + e.getMessage());
            System.out.println();
            System.out.println("toString():=> " + e.toString());
            System.out.println();
            System.out.println("println():=> You tried to access an invalid array index. Please check the index range.");
            System.out.println();
            System.out.println("printStackTrace():=>");
            e.printStackTrace();

        } finally {
            scanner.close();
        }
    }
}
