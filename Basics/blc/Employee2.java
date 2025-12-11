package Basics.blc;

// Business Logic Class - Employee
public class Employee2 {
    private int employeeNumber;
    private String employeeName;
    private double employeeSalary;

    public Employee2(int employeeNumber, String employeeName, double employeeSalary) {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    // Setters and Getters (same as yours - correct)
    public void setEmployeeNumber(int employeeNumber){
        this.employeeNumber = employeeNumber;
    }

    public int getEmployeeNumber(){
        return this.employeeNumber;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public String getEmployeeName(){
        return this.employeeName;
    }

    public void setEmployeeSalary(double employeeSalary){
        this.employeeSalary = employeeSalary;
    }

    public double getEmployeeSalary(){
        return this.employeeSalary;
    }

    // FIXED: getEmployeeDesignation method
    public String getEmployeeDesignation(double updatedSalary) {
        if (updatedSalary == 120000) {
            return "a HR Manager.";
        } else if (updatedSalary == 90000) {
            return "a Developer.";
        } else if (updatedSalary == 60000) {
            return "a Designer.";
        } else {
            return "a Tester.";
        }
    }

    // FIXED: toString method
    public String toString() {
        return "Employee Number : " + employeeNumber + "\n" +
                "Employee Name   : " + employeeName + "\n" +
                "Employee Salary : " + employeeSalary;
    }
}