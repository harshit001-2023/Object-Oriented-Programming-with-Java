package company;

public class EmpDetails {
    public static void main(String[] args) {
        Employee emp = new Manager("Harshit", 101, "101, Malabar Hills");
        Employee emp1 = new Developer("Harry", 102,"154, Hills");
        Employee emp2 = new Intern("Kamna", 245, "Ramnagar");

        emp.empDetails();
        emp.position();
        System.out.print("\n");
        emp1.empDetails();
        emp1.position();
        System.out.print("\n");
        emp2.empDetails();
        emp2.position();
    }
}
