package Inheritance.intro;

public class SingleLevelDemo {
    static void main() {
        PermenantEmployee permenantEmployee = new PermenantEmployee(1, "Sam", 100000, "IT", "SDE");
        IO.println(permenantEmployee);
    }
}
class ContractEmployee{
    protected int id;
    protected String name;
    protected double salary;

    public ContractEmployee(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
class PermenantEmployee extends ContractEmployee{
    protected String department;
    protected String designation;

    public PermenantEmployee(int id, String name, double salary, String department, String designation) {
        super(id, name, salary);
        this.department = department;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "PermanentEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
