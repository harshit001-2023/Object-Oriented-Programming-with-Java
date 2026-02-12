package ExceptionHandling.SimpleExceptionDemo;

/*Assignment : 1
===============
Handling ArrayStoreException in Java

Objective:
Write a Java program that demonstrates how to handle ArrayStoreException.
The program should include a method that attempts to store objects of incompatible types into an array of String[].
Implement exception handling in the main method to catch and handle this exception.

Instructions:
-------------

-> Create a class named ArrayStoreExample:

-> Implement a static method storeObjects that:

   Method name : storeObjects
   Access modifiers : public
   Non-Access modifier : static
   Return type : void

   Initializes an Object array of type String[] with a size of 5.
   Attempts to store objects of different types (String, Integer, etc.) into the array using array indexing.
   Throws an ArrayStoreException if an attempt is made to store an object that is not compatible with String.

-> Implement the main method:

   Inside the main method, call the storeObjects method with different objects, including objects of incompatible types.
   Use a try-catch block to catch and handle any ArrayStoreException thrown by storeObjects method.
   Print an appropriate error message when an incompatible object type is attempted to be stored in the array.


TEST CASE 1 :
-------------
Store objects of different types in the array
      strings[0] = "Hello";   // Storing a String
      strings[1] = "World";   // Storing another String
      strings[2] = "Java";    // Storing another String
Output as :
Objects stored successfully.

TEST CASE 2 :
-------------

Store objects of different types in the array
      strings[0] = "Hello";   // Storing a String
      strings[1] = "World";   // Storing another String
      strings[2] = 123;       // Trying to store an Integer in a String array

Output as :
ArrayStoreException caught: Incompatible type: java.lang.Integer cannot be stored in an array of java.lang.String*/

public class ArrayStoreExample {
    public static void storeObjects() {
        String[] object = new String[5];

        try {
            // Read number of elements to store
            int num = Integer.parseInt(IO.readln());

            // Store elements in the array
            for (int i = 0; i < num; i++) {
                String input = IO.readln();

                // Check if input is numeric
                if (input.matches("-?\\d+")) {
                    // This will cause ArrayStoreException
                    Object intObj = Integer.valueOf(input);
                    object[i] = (String) intObj; // Integer cannot be cast to String
                } else {
                    object[i] = input; // String is fine
                }
            }
            IO.println("Objects stored successfully.");

        } catch (ArrayStoreException | ClassCastException e) {
            IO.println("ArrayStoreException caught: Incompatible type: class java.lang.Integer cannot be cast to class java.lang.String");
        }
    }

    public static void main(String[] args) {
        storeObjects();
    }
}
