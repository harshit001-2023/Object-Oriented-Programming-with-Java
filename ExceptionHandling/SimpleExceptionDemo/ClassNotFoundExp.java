package ExceptionHandling.SimpleExceptionDemo;

/*1. ClassNotFoundExpDemo2
Easy
100 points
• 125 min suggested
Problem Description
Develop a Java application that demonstrates the use of Java Reflection and exception handling.
The program should prompt the user to enter the fully qualified name of a class and attempt to dynamically load the class using Class.forName().
If the class does not exist, the application must handle the resulting ClassNotFoundException gracefully.

Instructions:
-------------

-> Create a class named ClassNotFoundExpDemo:

-> Implement a constructor that takes a String parameter representing the class name.
   Access Modifier : public
   parameter : String

-> Inside the constructor, declare a variable of type Class<?>.
   Use a try block to attempt to load the class using Class.forName(className).
   Catch ClassNotFoundException and print an appropriate message along with the stack trace.

-> Create a main method:
   Inside the main method, create a Scanner object to read input from the user.
   Prompt the user to enter a class name.
   Read the user's input and pass it to the ClassNotFoundExpDemo constructor.
   Close the Scanner object.


TEST CASE 1 :
-------------
Input:
Enter the class name to load: java.lang.String

Output:
Class loaded successfully: java.lang.String


TEST CASE 2 :
--------------
Input:
Enter the class name to load: com.nareshit.Faculty

Output:
Error: Class 'com.nareshit.Faculty' not found.
java.lang.ClassNotFoundException: com.nareshit.Faculty
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:525)
	at java.base/java.lang.Class.forName0(Native Method)
	at java.base/java.lang.Class.forName(Class.java:375)
	at com.testing.ClassNotFoundExpDemo.<init>(ClassNotFoundExpDemo.java:10)
	at com.testing.ClassNotFoundExpDemo.main(ClassNotFoundExpDemo.java:27)

Examples
Example 1
Input:
Enter the class name to load: java.lang.String
Output:
Class loaded successfully: java.lang.String*/

import java.util.Scanner;

public class ClassNotFoundExp {

    // Constructor that takes class name as parameter
    public ClassNotFoundExp(String className) {
        Class<?> loadedClass = null;

        try {
            // Attempt to load the class using reflection
            loadedClass = Class.forName(className);
            System.out.println("Class loaded successfully: " + className);

        } catch (ClassNotFoundException e) {
            // Handle class not found exception
            System.out.println("Error: Class '" + className + "' not found.");
            e.printStackTrace();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for class name
        System.out.print("Enter the class name to load: ");
        String className = scanner.nextLine();

        // Create instance which will attempt to load the class
        new ClassNotFoundExp(className);

        scanner.close();
    }
}
