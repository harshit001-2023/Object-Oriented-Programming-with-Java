package Inheritance.intro.Abstraction;

class EmpSal {
    public static void main(String[] args) {
        // Write your code here
        var choice = Integer.parseInt(IO.readln("Enter Choice [1/2]: "));
        String name = IO.readln("Enter your name: ");
        if (choice == 1) {
            // Permanent Inheritance.intro.Abstraction.Employee
            double basicPay = Double.parseDouble(IO.readln("Enter Basic Pay: "));
            double allowance = Double.parseDouble(IO.readln("Enter Allowance: "));

            PermanentEmployee pE = new PermanentEmployee(name, basicPay, allowance);
            pE.displayInfo();

        } else if (choice == 2) {
            // Contract Inheritance.intro.Abstraction.Employee
            double hourlyRate = Double.parseDouble(IO.readln("Enter hourly rate: "));
            double hoursWorked = Double.parseDouble(IO.readln("Enter Hours Worked: "));

            ContractEmployee cE = new ContractEmployee(name, hourlyRate, hoursWorked);
            cE.displayInfo();

        } else {
            IO.println("Invalid choice!");
        }

    }
}

// Abstract Class
abstract class Employee{
    protected String name;

    // Constructor
    public Employee(String name){
        this.name = name;
    }

    // Abstract Unimplemented method
    abstract double calculateSalary();

    // Method for displaying Info
    public void displayInfo() {
        IO.println("Inheritance.intro.Abstraction.Employee Details:");
        IO.println("Inheritance.intro.Abstraction.Employee Name: " + name);
        IO.println("Salary: " + calculateSalary());
    }
}

class PermanentEmployee extends Employee{
    protected double basicPay;
    protected double allowance;

    // Constructor
    public PermanentEmployee(String name, double basicPay, double allowance) {
        super(name);
        this.basicPay = basicPay;
        this.allowance = allowance;
    }

    // Overriding Calculate method from parent class
    @Override
    double calculateSalary() {
        return basicPay + allowance;
    }
}

class ContractEmployee extends Employee{
    protected double hourlyRate;
    protected double hoursWorked;

    // Constructor
    public ContractEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Again overriding the method
    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
