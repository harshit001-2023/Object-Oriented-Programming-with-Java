package company;

public class EmpDetails {
    public static void main(String[] args) {
        Employee emp = new Manager("Harshit", 101, "101, Malabar Hills");//Created Employee object for Manager
        Employee emp1 = new Developer("Harry", 102,"154, Hills");;//Created Employee object for Developer
        Employee emp2 = new Intern("Kamna", 245, "Ramnagar");;//Created Employee object for Intern

        //Calling empDetails and position method from the Employee Class for each object
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
