/*Assignment 01 :
----------------
Create a BLC class Rectangle

Attributes :

names        datatypes
------       ----------
width           double-privatre
height          double-private

Implement a parameterized constructor to initialize the non static Field width and height.

Methods :
---------
1)
Method Name : getArea()
Parameter : No Parameters
Return Type : double
Access modifier : public

In this method returns the area of the rectangle.

2)
Method Name : getPerimeter()
Parameter : No Parameters
Return Type : double
Access modifier : public

In this method returns the perimeter of the rectangle.

Note : Don't use toString() method

Take one Main class ELC class which is having main method,
Create a Rectangle object with width 5 and height 10 and call
the getArea() and getPerimeter() methods on it.


Test Cases 1 :
------------------
Valid Case: width = 5, height = 10

Sample Input: width = 5, height = 10

Expected Output:

Area: 50.0
Perimeter: 30.0

Test Cases 2 :
------------------
Invalid Case: Negative width

Sample Input: width = -5, height = 10

Expected Output:

Error: Width and height must be non-negative.*/

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
