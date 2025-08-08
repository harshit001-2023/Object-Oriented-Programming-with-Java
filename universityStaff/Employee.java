package universityStaff;

public abstract class Employee {
    protected String name;
    protected String department;
    protected String designation;
    protected int id;
    protected double salary;

    public void diplayInfo(){

    }
    public double calculateBonus() {
        return salary * 0.5; // 10% for example
    }

}
