package Basics.oop;

public class EmployeeSalaryUsingEncapsulation {
    private int empID;
    private String empName;
    private double salary;

    public EmployeeSalaryUsingEncapsulation(int empID, String empName, double salary){
        this.empID = empID;
        this.empName = empName;
        this.salary = salary;
    }

    public void setEmpId(int empID){
            this.empID = empID;
    }

    public int getEmpId(){
        if(empID > 0) {
            return empID;
        }else{
            IO.println("Invalid Employee ID\n");
            return 0;
        }

    }

    public void setEmpName(String empName){
        this.empName = empName;
    }

    public String getEmpName(){
        return this.empName;
    }

    public void setSalary(int salary){
            this.salary = salary;
    }

    public double getSalary(){
        if(salary > 0) {
            return this.salary;
        }else{
            IO.println("Salary can not be negative\n");
            return 0.0;
        }
    }

    public String toString(){
        return "--- Employee Details ---"+
                "\nEmployee ID   : "+getEmpId()+
                "\nEmployee Name : "+empName+
                "\nSalary        : "+getSalary();
    }

    static void main(){
        int empID = Integer.parseInt(IO.readln());
        String empName = IO.readln();
        double salary = Double.parseDouble(IO.readln());

        EmployeeSalaryUsingEncapsulation employee = new EmployeeSalaryUsingEncapsulation(empID, empName, salary);
        IO.println(employee.toString());
    }
}
