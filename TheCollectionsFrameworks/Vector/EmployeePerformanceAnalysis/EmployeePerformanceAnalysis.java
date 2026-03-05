package TheCollectionsFrameworks.Vector.EmployeePerformanceAnalysis;

/*Employee Performance Analysis
Hard
Core Java • Collections • Vector
100 Points
Description
A company wants to reward its top-performing employees based on their salaries.
You are tasked to write a Java program that:
Takes the number of employees as input.
Stores employee names and salaries in two Vectors.
Sorts the employees in descending order of their salaries.
Displays the top 3 highest-paid employees along with their salaries.
Also, calculates the average salary, and displays the names of employees earning below the average.
This program combines multiple operations: sorting, indexing, and filtering based on conditions,
which is a hard-level problem.

Requirements and Explanation:

Class: EmployeePerformanceAnalysis – Main class containing all logic.

Methods:

inputData() :- Input employee names and salaries from the user.

calculateAverageSalary() :- Calculate average salary of employees.

displayTopEarners(int topN) :- Display top N highest-paid employees.

displayBelowAverageEmployees(double avgSalary) :- Display employees earning below average.

sortEmployeesBySalary() :- Sort employees in descending order by salary using Vector.

Variables:

Vector<String> employeeNames :- Stores employee names.

Vector<Double> employeeSalaries :- Stores corresponding salaries.

int n :- Number of employees.

double averageSalary :- Stores calculated average salary.

Temporary variables for sorting: String tempName, double tempSalary.
Examples
Example 1:

Input

Enter number of employees: 4
Enter name of employee 1: John
Enter salary of John: 50000
Enter name of employee 2: Emma
Enter salary of Emma: 60000
Enter name of employee 3: Mike
Enter salary of Mike: 45000
Enter name of employee 4: Sophia
Enter salary of Sophia: 70000
Output

Top 3 highest-paid employees:
Sophia - 70000.0
Emma - 60000.0
John - 50000.0

Employees earning below average salary (56250.0):
John
Mike
Example 2:

Input

Enter number of employees: 3
Enter name of employee 1: Alice
Enter salary of Alice: 75000
Enter name of employee 2: Bob
Enter salary of Bob: 40000
Enter name of employee 3: Charlie
Enter salary of Charlie: 55000
Output

Top 3 highest-paid employees:
Alice - 75000.0
Charlie - 55000.0
Bob - 40000.0

Employees earning below average salary (56666.67):
Charlie
Bob
Explanation

This program uses two Vectors to store employee names and salaries.
It sorts employees in descending order of salary using nested loops and swaps names with corresponding salaries.
Average salary is calculated and employees below average are displayed.
*/
public class EmployeePerformanceAnalysis {
    static void main() {

    }


}




