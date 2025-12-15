package Basics.blc;

public class Employee3 {
    private String name;
    private int id;
    private String department;
    private double salary;

    public Employee3(String name, int id, String department, double salary){
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public static Employee3 createEmployeeObject(String name, int id, String department, double monthlySalary) {
        return new Employee3(name, id, department, monthlySalary);
    }

    public double calculateAnnualSalary() {
        double annualBase = salary * 12;
        double bonusPercentage = switch(department.toUpperCase()) {
            case "ENGINEERING" -> 0.15;
            case "SALES" -> 0.10;
            case "HR" -> 0.08;
            default -> 0.05;
        };

        return annualBase + (annualBase * bonusPercentage);
    }

    public String toString() {
        return String.format("ID: %d, Name: %s, Department: %s, Monthly Salary: %.2f,\nAnnual Salary (with Bonus): %.2f",
                id, name, department, salary, calculateAnnualSalary());
    }
}
