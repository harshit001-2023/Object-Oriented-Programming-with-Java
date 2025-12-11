package Basics.elc;

import Basics.blc.Employee2;

// ELC - EmployeeDemo
public class EmployeeDemo1 {
    static void main() {
        // Read inputs with prompts
        int employeeNumber = Integer.parseInt(IO.readln("Enter Employee Number : "));
        String employeeName = IO.readln("Enter Employee Name   : ");
        double employeeSalary = Double.parseDouble(IO.readln("Enter Employee Salary : "));

        // Create employee and print initial details
        Employee2 employee2 = new Employee2(employeeNumber, employeeName, employeeSalary);

        IO.println("\n--- Employee Details ---");
        IO.println(employee2.toString());  // Print initial details

        // Read increment amount
        double incAmount = Double.parseDouble(IO.readln("Enter Increment Amount : "));

        // Update salary using setter
        double updatedSalary = employee2.getEmployeeSalary() + incAmount;
        employee2.setEmployeeSalary(updatedSalary);

        // Print updated details
        IO.println("\n--- Updated Employee Details ---");
        IO.println(employee2.toString());

        // Get and print designation
        String designation = employee2.getEmployeeDesignation(updatedSalary);
        IO.println("\n" + employeeName + " is " + designation);
    }
}

