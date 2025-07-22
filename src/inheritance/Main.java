package src.inheritance;

public class Main {
    public static void main(String[] args) {
        //Reference object of Class Headmaster
        Headmaster h = new Headmaster("Mr. Sharma", "Admin", 20);
        h.showRole();//Calling showRole method of class Headmaster

        System.out.println("-----------------");

        //Reference object of Class Teacher
        Teacher t = new Teacher("Ms. Neha", "Science", "Physics");
        t.showRole();//Calling showRole method of Class Teacher

        System.out.println("-----------------");

        //Reference object of Class Student
        Student s = new Student("Rahul", "Science", 1023);
        s.showRole();//showROle method calling of class Student
    }
}
