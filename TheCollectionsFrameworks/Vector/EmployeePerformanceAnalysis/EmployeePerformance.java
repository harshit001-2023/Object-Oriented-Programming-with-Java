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
import java.util.*;

public class EmployeePerformance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeePerformanceAnalysis analysis = new EmployeePerformanceAnalysis(scanner);

        analysis.n = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        analysis.inputData();
        analysis.calculateAverageSalary();
        analysis.sortEmployeeBySalary();
        analysis.displayTopEarners(3);
        analysis.displayBelowAverageEmployees(analysis.averageSalary);

        scanner.close();
    }
}

class EmployeePerformanceAnalysis {
    Vector<String> employeeNames;
    Vector<Double> employeeSalary;
    int n;
    double averageSalary;
    Scanner scanner; // Single scanner instance

    // Constructor with Scanner parameter
    public EmployeePerformanceAnalysis(Scanner scanner) {
        this.scanner = scanner;
        employeeNames = new Vector<>();
        employeeSalary = new Vector<>();
    }

    // Method for taking input data
    public void inputData() {
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            employeeNames.add(name);

            double salary = scanner.nextDouble();
            scanner.nextLine(); // consume the newline
            employeeSalary.add(salary);
        }
    }

    // Method to Calculate Average Salary of an employee
    public void calculateAverageSalary() {
        double sum = 0;
        for (double salary : employeeSalary) {
            sum += salary;
        }
        averageSalary = sum / n;
    }

    // Method for Displaying Top Earners
    public void displayTopEarners(int topN) {
        System.out.println("\nTop " + topN + " highest-paid employees:");
        int limit = Math.min(topN, n);

        for (int i = 0; i < limit; i++) {
            System.out.println(employeeNames.get(i) + " - " + employeeSalary.get(i));
        }
    }

    public void displayBelowAverageEmployees(double avgSalary) {
        System.out.println("\nEmployees earning below average salary (" +String.format("%.2f", avgSalary) + "):");

        for (int i = 0; i < n; i++) {
            if (employeeSalary.get(i) < avgSalary) {
                System.out.println(employeeNames.get(i));
            }
        }
    }

    public void sortEmployeeBySalary() {
        // Bubble sort in descending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (employeeSalary.get(j) < employeeSalary.get(j + 1)) {
                    // Swap salaries
                    double tempSalary = employeeSalary.get(j);
                    employeeSalary.set(j, employeeSalary.get(j + 1));
                    employeeSalary.set(j + 1, tempSalary);

                    // Swap corresponding names
                    String tempName = employeeNames.get(j);
                    employeeNames.set(j, employeeNames.get(j + 1));
                    employeeNames.set(j + 1, tempName);
                }
            }
        }
    }
}




