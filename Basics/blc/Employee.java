package Basics.blc;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public void setEmployeeDetails(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void calculateSalaryIncrement(){
        double sevenPercentInc = (salary * 0.05);
        double fivePercentInc = (salary * 0.07);
        double tenPercentInc = (salary * 0.1);
        if (salary >= 80000) IO.println("Salary Incremented by 5%, so incremented amount = "+ fivePercentInc+" Incremented Salary: "+ (salary + fivePercentInc));
        else if (salary < 80000 && salary >= 50000) IO.println("Salary Incremented by 7%, so incremented amount = "+ sevenPercentInc+" Incremented Salary: "+ (salary + sevenPercentInc));
        else IO.println("Salary Incremented by 10%, so incremented amount = "+ tenPercentInc+" Incremented Salary: "+ (salary + tenPercentInc));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
