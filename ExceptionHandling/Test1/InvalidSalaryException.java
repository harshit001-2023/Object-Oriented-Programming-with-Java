package ExceptionHandling.Test1;

//1. CheckedExceptionDemonstrate1
//        Easy
//        100 points
//        • 125 min suggested
//        Problem Description
//        Write a Java program to create, throw, and handle any one checked exception.
//
//        Scenario:
//
//        A company requires that an employee’s salary must be at least ₹10,000.
//        If the entered salary is less than ₹10,000, the system should raise an error.
//
//        You are required to develop a Java program that:
//
//        Creates a user-defined checked exception named InvalidSalaryException.
//
//        Implements a method named checkSalary(double salary) that:
//
//        Declares the exception using the throws keyword.
//
//        Throws the exception if salary is less than ₹10,000.
//
//        Handles the exception properly inside the main() method using a try-catch block.
//
//        Displays appropriate messages for valid and invalid salary.
//
//        Examples
//        Example 1
//        Input:
//        Enter Salary: 8000
//        Output:
//        Exception Caught: Salary must be at least 10000.
//        Program finished.
//        ANS
//        --------------------------------------------

import java.util.Scanner;
import java.lang.Exception;

public class InvalidSalaryException extends Exception
{

    public InvalidSalaryException(String msg)
    {
        super(msg);
    }

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        try(sc)
        {
            System.out.println("Enter Salary : ");
            double sal=sc.nextDouble();
            checkSalary(sal);
            IO.println("Valid Salary: "+sal);
        }

        catch(InvalidSalaryException e)
        {
            IO.println("Exception Caught: Salary must be at least 10000.");
        }
        IO.println("Program finished.");

    }
    public static void checkSalary(double salary)throws InvalidSalaryException
    {
        if(salary<10000)
        {
            throw new InvalidSalaryException("Salary must 100000" );
        }

    }
}
