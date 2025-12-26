package Inheritance.intro;

class Employee{
    protected int employeeID;
    protected String employeeName;
    protected double employeeSalary;

    public Employee(int employeeID, String employeeName, double employeeSalary) {
        if(employeeID <=0) {
            System.err.println("Invalid Employee ID.");
            System.exit(0);
        }
        if (employeeName == null || employeeName.trim().isEmpty()) {
            System.err.println("Employee Name can't be null.");
            System.exit(0);
        }
        if (employeeSalary <= 0) {
            System.err.println("Salary can't be 0 or negative.");
            System.exit(0);
        }
        else {
            this.employeeID = employeeID;
            this.employeeName = employeeName;
            this.employeeSalary = employeeSalary;
        }
    }
}

class PermanentEmployee extends Employee{
    protected double provideFund;

    public PermanentEmployee(int employeeID, String employeeName, double employeeSalary) {
        super(employeeID, employeeName, employeeSalary);
        this.provideFund = employeeSalary*0.12;
    }

    @Override
    public String toString() {
        return "PermanentEmployee{" +
                "employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", provideFund=" + provideFund +
                '}';
    }

    public void netSalary(){
        IO.println("Net Salary = "+(employeeSalary + provideFund));
    }
}

class ContractEmployee1 extends Employee{
    protected int contractDuration;

    public ContractEmployee1(int employeeID, String employeeName, double employeeSalary, int contractDuration) {
        super(employeeID, employeeName, employeeSalary);
        this.contractDuration = contractDuration;
    }

    @Override
    public String toString() {
        return "ContractEmployee1{" +
                "employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", contractDuration=" + contractDuration +
                '}';
    }
}

public class EmployeeSystem {
    static void main(){
        int id = Integer.parseInt(IO.readln("Enter permanent employee Id : "));
        String name = IO.readln("Enter permanent employee Name : ");
        double salary = Double.parseDouble(IO.readln("Enter permanent employee Salary : "));


        PermanentEmployee permanentEmployee = new PermanentEmployee(id, name, salary);
        IO.println(permanentEmployee);
        permanentEmployee.netSalary();
        IO.println("=================================================================");
        int duration = Integer.parseInt(IO.readln("Enter contract duration in year : "));
        ContractEmployee1 contractEmployee = new ContractEmployee1(id, name, salary, duration);
        IO.println(contractEmployee);
    }
}
