package Inheritance.ObjectClassMethod;

//International Employee Payroll System.
//Medium
//Core Java • Object Class Methods • getClass()
//50 Points
//        Description
//You are developing an International Employee Payroll System.
//
//The system handles different employee types such as FullTime, PartTime, and Freelancer.
//To calculate salary correctly, the system must identify the runtime class of each employee object using getClass() and perform type-specific salary calculations.
//
//        Class Details
//
//Create a class named Employee.
//
//Data Members
//String employeeId // unique employee identifier
//String employeeName // full name of employee
//double baseSalary // base salary
//
//Constructor
//Employee(String employeeId, String employeeName, double baseSalary)
//Initializes all fields.
//
//        Method
//printSalaryDetails()
//
//Logic
//Use getClass() to identify the runtime class.
//Print class name using getClass().getSimpleName().
//If employee is FullTime → total salary = baseSalary + 20% bonus.
//        If employee is PartTime → total salary = baseSalary × 0.5.
//If employee is Freelancer → total salary = baseSalary × 0.8 + 100 (fixed project allowance).
//
//Create subclasses of Employee:
//
//FullTime
//
//        PartTime
//
//Freelancer
//
//Each subclass inherits from Employee and calls super constructor.
//
//Main Class Details
//
//Create a class named PayrollApp.
//
//Use Scanner to read employee details: employeeId, employeeName, baseSalary.
//Ask user to specify employee type (FullTime/PartTime/Freelancer).
//Create the appropriate subclass object.
//        Call printSalaryDetails() to display class name and calculated total salary.
//Examples
//Example 1:
//
//Input
//
//Enter employee ID:
//EMP101
//Enter employee name:
//Oliver
//Enter base salary:
//        5000
//Enter employee type (FullTime/PartTime/Freelancer):
//FullTime
//        Output
//
//Employee class type: FullTime
//Employee ID: EMP101
//Employee Name: Oliver
//Total Salary: 6000.0
//Example 2:
//
//Input
//
//Enter employee ID:
//EMP202
//Enter employee name:
//Sophia
//Enter base salary:
//        4000
//Enter employee type (FullTime/PartTime/Freelancer):
//Freelancer
//        Output
//
//Employee class type: Freelancer
//Employee ID: EMP202
//Employee Name: Sophia
//Total Salary: 3300.0
//Explanation
//
//getClass() identifies runtime object type dynamically.
//Subclasses allow type-specific salary computation.
//Prints accurate payroll for FullTime, PartTime, and Freelancers.
//Useful in multinational payroll systems with mixed employee types.
//        Constraints
//Employee ID length: 3–10
//Employee name length: 3–25
//Base salary > 0


import java.util.*;

class Employee {
    String employeeId;
    String employeeName;
    double baseSalary;

    Employee(String employeeId, String employeeName, double baseSalary) {
        if(baseSalary < 0){
            System.out.println("Error: Invalid employee details");
            System.exit(0);
        }
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.baseSalary = baseSalary;
    }

    public void printSalaryDetails() {
        String className = this.getClass().getSimpleName();
        double totalSalary = 0;

        if (className.equals("FullTime")) {
            totalSalary = baseSalary + (baseSalary * 0.20);
        } else if (className.equals("PartTime")) {
            totalSalary = baseSalary * 0.5;
        } else if (className.equals("Freelancer")) {
            totalSalary = (baseSalary * 0.8) + 100;
        }

        System.out.println("Employee class type: " + className);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Total Salary: " + totalSalary);
    }
}

class FullTime extends Employee {
    FullTime(String employeeId, String employeeName, double baseSalary) {
        super(employeeId, employeeName, baseSalary);
    }
}

class PartTime extends Employee {
    PartTime(String employeeId, String employeeName, double baseSalary) {
        super(employeeId, employeeName, baseSalary);
    }
}

class Freelancer extends Employee {
    Freelancer(String employeeId, String employeeName, double baseSalary) {
        super(employeeId, employeeName, baseSalary);
    }
}

public class InternationEmployeePayroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String employeeId = sc.nextLine();
        String employeeName = sc.nextLine();
        double baseSalary = sc.nextDouble();
        sc.nextLine();
        String empType = sc.nextLine();

        Employee emp = null;

        if (empType.equalsIgnoreCase("FullTime")) {
            emp = new FullTime(employeeId, employeeName, baseSalary);
        } else if (empType.equalsIgnoreCase("PartTime")) {
            emp = new PartTime(employeeId, employeeName, baseSalary);
        } else if (empType.equalsIgnoreCase("Freelancer")) {
            emp = new Freelancer(employeeId, employeeName, baseSalary);
        }

        if (emp != null) {
            emp.printSalaryDetails();
        }
    }
}

