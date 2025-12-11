package Basics.elc;

import Basics.blc.Rectangle;

// ELC - Main class
class RectangleDemo {
    static void main() {
        // According to problem: "Create a Rectangle object with width 5 and height 10"
        // So we should use hardcoded values for testing

        // Test Case 1: Valid case
        IO.println("Test Case 1: width = 5, height = 10");
        Rectangle rectangle1 = new Rectangle(5, 10);
        IO.println("Area: " + rectangle1.getArea());
        IO.println("Perimeter: " + rectangle1.getPerimeter());
        IO.println();

        // Test Case 2: Invalid case
        IO.println("Test Case 2: width = -5, height = 10");
        Rectangle rectangle2 = new Rectangle(-5, 10);
        // If constructor handles error properly, we should still be able to call methods
        IO.println("Area: " + rectangle2.getArea());
        IO.println("Perimeter: " + rectangle2.getPerimeter());

        // Alternative: Interactive version
        /*
        IO.println("Enter width: ");
        double width = Double.parseDouble(IO.readln());

        IO.println("Enter height: ");
        double height = Double.parseDouble(IO.readln());

        Rectangle rectangle = new Rectangle(width, height);
        IO.println("Area: " + rectangle.getArea());
        IO.println("Perimeter: " + rectangle.getPerimeter());
        */
    }
}
