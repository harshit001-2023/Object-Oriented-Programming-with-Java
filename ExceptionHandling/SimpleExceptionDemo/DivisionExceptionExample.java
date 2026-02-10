package ExceptionHandling.SimpleExceptionDemo;

/*Ques : 1
=========

Handling ArithmeticException

Objective:
Write a Java program that demonstrates how to handle ArithmeticException.
The program should include a method that performs division and throws an ArithmeticException if division by zero occurs.
Implement exception handling in the main method to catch and handle this exception.

Instructions:
-------------

-> Create a class named DivisionExample:

-> Implement a static method performDivision :
   Takes two integer parameters: dividend and divisor.
   Access Modifier : public
   Non-Access Modifier : static
   return type : int
   parameters : int, int

-> Performs division operation (dividend / divisor).
   Throws an ArithmeticException if divisor is zero.

-> Implement the main method:
   Inside the main method, call the performDivision method with different inputs, including zero as a divisor.
   Use a try-catch block to catch and handle any ArithmeticException thrown by performDivision method.
   Print an appropriate error message when division by zero occurs.



TEST CASE 1 :
------------
Input as :
Enter dividend : 10
Enter divisor : 2

Output as :
Result of division : 5


TEST CASE 2 :
-------------
Input as :
Enter dividend : 5
Enter divisor : 0

Output :
ArithmeticException caught: Division by zero: dividend=5, divisor=0*/

public class DivisionExceptionExample {

    // Static method to perform division
    public static int performDivision(int dividend, int divisor) {
        // This will throw ArithmeticException if divisor is 0
        return dividend / divisor;
    }

    // Main method
    static void main() {

        // Read inputs
        System.out.print("Enter dividend : ");
        int dividend = Integer.parseInt(IO.readln());

        System.out.print("Enter divisor : ");
        int divisor = Integer.parseInt(IO.readln());

        try {
            // Call the division method
            int result = performDivision(dividend, divisor);
            System.out.println("Result of division : " + result);

        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("ArithmeticException caught: Division by zero: dividend=" +
                    dividend + ", divisor=" + divisor);
        }
    }
}
