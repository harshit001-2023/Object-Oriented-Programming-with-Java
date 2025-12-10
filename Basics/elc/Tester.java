/*Assignment 02
--------------
Create an Employee class (BLC Class)

Attributes/Properties :[private access modifier for all the fields]

names		 Type
--------	---------------
 firstName   	:String
 lastName      	:String
 employeeId 	:int
 salary  	:double
 NoOfProject 	:int

Implement parameterized constructors to initialize these properties.

Generate toString() method to print Object Properties.

implement calculateSalary() method that will add extra ammount in salary based on NoOfProject.

Return Type     : void
Access modifier :public

NoOfProject is more than 5 and less than 10 then add 5000
NoOfProject is more than 10 and less that 20 then add 10000
NoOfProject is more than 20 then add 15000

Take another class Tester (ELC Class) which is having main method and instantiate the Employee object and execute the methods.


Test Case 1:
----------------
Valid Input with Projects Between 6 and 10
Input:

firstName: John
lastName: Doe
employeeId: 101
salary: 50000.00
NoOfProject: 7

Expected Output:

After executing calculateSalary(), the salary should be updated to 55000.00.
Print output showing the updated salary: 55000.00.

Test Case 2:
---------------
 Invalid Number of Projects (Negative Value)
Sample Input:

firstName: Michael
lastName: Johnson
employeeId: 105
salary: 45000.00
NoOfProject: -5

Expected Output:

Print an error message indicating invalid number of projects (e.g., "Number of projects cannot be negative").
Salary remains 45000.00.*/

package Basics.elc;

import Basics.blc.Employee1;

public class Tester {
    static void main(){
        String firstName = IO.readln("Enter first name: ");
        String lastName = IO.readln("Enter last name: ");
        int employeeId = Integer.parseInt(IO.readln("Enter your employee id: "));
        double salary = Double.parseDouble(IO.readln("Enter Salary: "));
        int NoOfProject = Integer.parseInt(IO.readln("Enter your project number: "));

        Employee1 employee1 = new Employee1(firstName, lastName, employeeId, salary, NoOfProject);
        employee1.calculateSalary();
    }
}
