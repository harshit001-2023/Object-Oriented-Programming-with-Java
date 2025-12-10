/*Assignment 01
--------------
Create a program to understand the use of Constructor in java program.

Create a BLC class called Car

Attributes/Properties :[private access modifier for all the fields]

names		 Type
--------	---------------
 model   	:String
 year   	:int
 price  	:double

Implement a parameterized constructors to initialize these properties with parameter variable.

Generate toString() method to print Object properties.

Take another class ConstructorDemo (ELC Class) which is having main method and instantiate the Car object to get the desired output

Test Cases for Output :
------------------------
Enter Car Model :Toyota
Enter Car Manufacturing year :2025
Enter Car Price :1500000
Car [model=Toyota, year=2025, price=1500000.0]


Test Case for Input Validation :
--------------------------------
Test Case 1 :

Enter Car Model :Toyota
Enter Car Manufacturing year :2010
Enter Car Price :120000
year must be greater than 2010

Test Case 2 :

Enter Car Model :BMW
Enter Car Manufacturing year :2024
Enter Car Price :-1000000
Price must be positive integer*/

package Basics.elc;

import Basics.blc.Car;

public class ConstructorDemo {
    static void main() {
        String model = IO.readln("Enter Car model: ");
        int year = Integer.parseInt(IO.readln("Enter Car Manufacturing year: "));
        double price = Double.parseDouble(IO.readln("Enter Car Price: "));

        Car car = new Car(model, year, price);
        IO.println(car);
    }
}
