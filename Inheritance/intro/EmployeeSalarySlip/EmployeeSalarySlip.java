package Inheritance.intro.EmployeeSalarySlip;

class EmployeeSalarySlip{
    void main() {
        int choice = Integer.parseInt(IO.readln());
        int id = Integer.parseInt(IO.readln());
        String name = IO.readln();


        if (choice == 1) {
            double salary = Double.parseDouble(IO.readln());
            FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(id, name, salary);

            IO.println(name + " Salary is : " + fullTimeEmployee.calculateSalary());
        } else if (choice == 2) {
            int hourlyRate = Integer.parseInt(IO.readln());
            int hoursWorked = Integer.parseInt(IO.readln());
            PartTimeEmployee partTimeEmployee = new PartTimeEmployee(id, name, hourlyRate, hoursWorked);
            IO.println(name + " Salary is :" + partTimeEmployee.calculateSalary());
        }
    }
}

class Employee{
    protected int id;
    protected String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public double calculateSalary(){
        return 0.0;
    }
}

class FullTimeEmployee extends Employee{
    protected double salary;

    public FullTimeEmployee(int id, String name,double salary){
        super(id, name);
        if(salary <= 0){
            IO.println("Salary can't be negative!!!");
            System.exit(0);
        }
        this.salary = salary;
    }

    public double calculateSalary(){
        return salary;
    }
}

class PartTimeEmployee extends Employee{
    protected double hourlyRate;
    protected int hoursWorked;

    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name);
        if(hourlyRate <= 0){
            IO.println("Inheritance.intro.EmployeeSalarySlip.Employee hourly rate can't be zero OR Negative");
            System.exit(0);
        }
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary(){
        return (hourlyRate*hoursWorked);
    }
}
