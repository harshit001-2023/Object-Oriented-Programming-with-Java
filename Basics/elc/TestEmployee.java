/*1. TestEmployee
Easy
100 points
• 120 min suggested
Problem Description
Create a BLC class Employee.

Field/Attribute/Properties [Access modifier : private]

name : String
id : int
department : String
salary : double

Take a private parameterized constructor to initialize the field so, We can call the Constructor from BLC class only.

Methods :
----------
1)
Name of the Method : createEmployeeObject()
         Parameter : 4 parameters name, id, department and salary
       return type : Employee
   Access modifier : public
   Non access modifier : static
In this method return the Employee Object.


2) Generate toString() method. Call calculateAnnualSalary() method from
   this method to display deatils.

3)
Name of the Method : calculateAnnualSalary()
         Parameter : No Parameter
       return type : double
   Access modifier : public

In this method with the help of switch case calculates and returns the annual salary of the employee based on their salary (monthly salary).
Adds a bonus based on the department:
Sales: 10% bonus of annual salary.
Engineering: 15% bonus of annual salary.
HR: 8% bonus of annual salary.
Other: 5% bonus of annual salary.

Create a ELC class TestEmployee
Main Method: In the main method, write code to:

Take an Infinite while loop, Prompt the user to enter values for name, id,department and salary through IO class. Call the createEmployeeObject() with specified value which will return Employee object. Print Employee data using toString() method and print the
calculateAnnualSalary() also.

Ask choice from the user, whether the user wants to continue to create and return more Employee object or not. By using equalsIgnoreCase() come out from the Infinite loop, If the user choice is - no

Test Case :
-------------
How many employees do you want to create? 2

--- Employee Details ---

Enter details for Employee 1:
Enter Employee ID: 111
Enter Employee Name: Scott
Enter Monthly Salary: 40000
Enter Department (Sales, Engineering, HR, Other): HR
ID: 111, Name: Scott, Department: HR, Monthly Salary: 40000.00,
Annual Salary (with Bonus): 518400.00

Enter details for Employee 2:
Enter Employee ID: 222
Enter Employee Name: Smith
Enter Monthly Salary: 60000
Enter Department (Sales, Engineering, HR, Other): Sales
ID: 222, Name: Smith, Department: Sales, Monthly Salary: 60000.00,
Annual Salary (with Bonus): 792000.00

----------------------------------------------------------------------------------------------------------------------------------------


Examples
Example 1
Input:
1
111
Scott
40000
HR
Output:
ID: 111, Name: Scott, Department: HR, Monthly Salary: 40000.00,
Annual Salary (with Bonus): 518400.00*/

package Basics.elc;

import Basics.blc.Employee3;

public class TestEmployee {
    static void main(){
        int choice = Integer.parseInt(IO.readln());

        for(int i = 1; i <= choice; i++){
            int id = Integer.parseInt(IO.readln());
            String name = IO.readln();
            double salary = Double.parseDouble(IO.readln());
            String department = IO.readln();

            Employee3 employee = new Employee3(name, id, department, salary);

            employee.calculateAnnualSalary();
            IO.println(employee.toString());
        }
    }
}
