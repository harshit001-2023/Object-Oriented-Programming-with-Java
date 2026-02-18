package Arrays.EmployeeArrayDemo;

/*Assignment 02 :
---------------
Develop an array for Custom class object.

Coding requirement :
--------------------
Create a BLC class called Employee.

Attributes/Properties/Fields [tightly encapsulated]

id, name and salary

Take a parameetrized constructor to initialize all the fields.

Generate toString() method.

Take an ELC class called EmployeeArrayDemo with main method.

Create Scanner class object to initialize employee array dynamically. [User choice]

Take a for loop to initialize the employee array with user input.

Take a forEach() loop to retrieve and pring array data.

Sample Output :
----------------
Enter number of employees: 3

Enter details for Employee 1:
Enter ID: 111
Enter Name: Scott
Enter Salary: 45789

Enter details for Employee 2:
Enter ID: 222
Enter Name: Smith
Enter Salary: 78908

Enter details for Employee 3:
Enter ID: 333
Enter Name: Alen
Enter Salary: 99567

===== Employee Details =====
Employee [id=111, name=Scott, salary=45789.0]
Employee [id=222, name=Smith, salary=78908.0]
Employee [id=333, name=Alen, salary=99567.0]*/

public class EmployeeArrayDemo {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee(123, "Hari", 50);
        employees[1] = new Employee(122, "Sam", 60);
        employees[2] = new Employee(121, "Sandy", 80);

        for(Employee st : employees){
            System.out.println(st);
        }
    }
}
class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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
