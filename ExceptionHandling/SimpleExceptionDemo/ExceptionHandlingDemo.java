package ExceptionHandling.SimpleExceptionDemo;

import java.util.Scanner;

public class ExceptionHandlingDemo {

    // Static method to handle exceptions as specified
    public static void handleExceptions(String input) {
        try {
            // 1. Print the length of the input string
            System.out.println("Length of the input string: " + input.length());

            // 2. Attempt to convert string to integer
            int number = Integer.parseInt(input);
            System.out.println("Converted to integer: " + number);

            // 3. This line will cause NullPointerException if input is null
            // (But we already accessed input.length() above, so it would fail there first)
            // Actually, we need to demonstrate NullPointerException separately
            // We can use a method that would cause NPE if input is null

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Input is not a valid integer.");

        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Input is null.");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        String input = scanner.nextLine();

        // Handle the special case of "null" string
        if (input.equals("null")) {
            // Pass actual null, not "null" string
            handleExceptions(null);
        } else {
            handleExceptions(input);
        }

        scanner.close();
    }
}
