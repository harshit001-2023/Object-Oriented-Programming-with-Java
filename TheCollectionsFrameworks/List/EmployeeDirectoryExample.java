package TheCollectionsFrameworks.List;

/*Program-1
=========
Employee Directory:
Develop an employee directory that stores employee information (name, position, salary) and allows CRUD operations using collections.

Employee Class:
This class represents an employee with attributes like name, position, and salary.
It has a constructor to initialize an employee's details and getters/setters to access and modify these details.
The toString() method is overridden to provide a string representation of an employee's details.

Directory Class:
This class manages a collection of Employee objects using an ArrayList.
The addEmployee() method adds an employee to the directory.
The displayAllEmployees() method prints details of all employees in the directory.
The updateEmployee() method updates an employee's information at a specified index in the directory.
The deleteEmployee() method removes an employee from the directory at a specified index.

EmployeeDirectoryExample Class (Main Class):
This class contains the main() method where an instance of Directory is created.
Two employees, "Alice" and "Bob," are added to the directory with their respective positions and salaries.
The displayAllEmployees() method is called to show all employees.
The details of "Bob" are updated to reflect a change in position and salary.
"Alice" is deleted from the directory.
Finally, the updated list of employees is displayed again.


Output:-
Employee{name='Alice', position='Manager', salary=60000.0}
Employee{name='Bob', position='Developer', salary=50000.0}

Employee{name='Alice', position='Manager', salary=60000.0}
Employee{name='Bob', position='Senior Developer', salary=55000.0}

Employee{name='Bob', position='Senior Developer', salary=55000.0}

Initial display after adding "Alice" as a Manager and "Bob" as a Developer.
Display after updating "Bob's" information to reflect the change in position and salary.
Display after deleting "Alice" from the directory.
Final display of the remaining employee, "Bob", with his updated information.*/

import java.util.ArrayList;

class Employee{
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Directory{
    private final ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) { employees.add(e); }

    public void displayAllEmployees() {
        if (employees.isEmpty()) IO.println("No employees found.");
        for (Employee e : employees) IO.println(e);
    }

    public void updateEmployee(int index, Employee e) {
        if (index >= 0 && index < employees.size()) {
            employees.set(index, e);
        } else {
            IO.println("Invalid index!");
        }
    }

    public void deleteEmployee(int index) {
        if (index >= 0 && index < employees.size()) {
            employees.remove(index);
        } else {
            IO.println("Invalid index!");
        }
    }

}

public class EmployeeDirectoryExample {
    static void main() {
        Directory directory = new Directory(); // Create ONCE outside the loop

        while (true) {
            IO.println("\n--- Employee Management System ---");
            IO.println("1. Add Employee\n2. Display All\n3. Update\n4. Delete\n5. Exit");
            int choice =Integer.parseInt(IO.readln("Enter Choice: "));

            switch (choice) {
                case 1:
                    String name = IO.readln("Enter Name: ");
                    String position = IO.readln("Enter Position: ");
                    double salary = Double.parseDouble(IO.readln("Enter Salary: "));
                    directory.addEmployee(new Employee(name, position, salary));
                    break;

                case 2:
                    directory.displayAllEmployees();
                    break;

                case 3:
                    int uIdx = Integer.parseInt(IO.readln("Enter Index to update: "));
                    String un = IO.readln("Enter new Name: ");
                    String up = IO.readln("Enter new Position: ");
                    double us = Double.parseDouble(IO.readln("Enter new Salary: "));
                    directory.updateEmployee(uIdx-1, new Employee(un, up, us));
                    break;

                case 4:
                    int dIdx = Integer.parseInt(IO.readln("Enter Index to delete: "));
                    directory.deleteEmployee(dIdx-1);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }

    }
}
