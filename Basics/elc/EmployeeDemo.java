package Basics.elc;

import Basics.blc.Employee;

public class EmployeeDemo {
    static void main() {
        int id = Integer.parseInt(IO.readln("Enter Employee ID: "));
        String name = IO.readln("Enter Employee Name: ");
        double salary = Double.parseDouble(IO.readln("Enter your salary: "));

        Employee employee = new Employee();
        employee.setEmployeeDetails(id, name, salary);
        employee.calculateSalaryIncrement();
        IO.println(employee);
    }



}
