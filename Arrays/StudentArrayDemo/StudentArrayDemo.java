package Arrays.StudentArrayDemo;

/*Assignment :
---------------------
Take record if applicable :
----------------------------------------
Assignment 01 :
---------------
Develop an array for Custom class object.

Coding requirement :
--------------------
Create a BLC class called Student.

Attributes/Properties/Fields [tightly encapsulated]

id, name and marks

Take a parameetrized constructor to initialize all the fields.

Generate toString() method.

Take an ELC class called StudentArrayDemo with main method.

Create Student array with size 3 manually.

Assign Student objects to array elements using index manually.

Take a forEach() loop to retrieve and pring array data.

Sample Output :
----------------
Student [id=101, name=Ravi, marks=89.5]
Student [id=102, name=Anita, marks=92.0]
Student [id=103, name=Kiran, marks=85.75]*/

public class StudentArrayDemo {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(123, "Hari", 50);
        students[1] = new Student(122, "Sam", 60);
        students[2] = new Student(121, "Sandy", 80);

        for(Student st : students){
            System.out.println(st);
        }
    }
}
class Student{
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}