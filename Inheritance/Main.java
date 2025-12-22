package Inheritance;

public class Main {
    public static void main(String[] args) {
        //Calling school and displaying school info
        School sh = new School("Saraswati Primary School","Kindergarten");
        sh.showDetails();

        System.out.println("-----------------");

        //Reference object of Class Headmaster
        Headmaster h = new Headmaster("Mr. Sharma", "Admin", 20);
        h.showRole("Handling School and its functions");//Calling showRole method of class Headmaster

        System.out.println("-----------------");

        //Reference object of Class Teacher
        Teacher t = new Teacher("Ms. Neha", "Science", "Physics");
        t.showRole(8);//Calling showRole method of Class Teacher

        System.out.println("-----------------");

        //Reference object of Class Student
//        Student s = new Student("Rahul", "Science", 1023);
//        s.showRole(6);//showROle method calling of class Student

        //Applying Encapsulation
        Student student = new Student("Rahul", "Science", 1023) {
            @Override
            public void showDetails(Student student) {
            }
        };
        student.setName("Harshit");
        student.setRollNumber(23);
        student.setMarks(83);
        System.out.println(student.getName()+" , "+student.getRollNumber()+ " , "+ student.getMarks());

        System.out.println("-----------------");

        Harshit hp = new Harshit("Harshit", "Science", 48, "CND");
        hp.showDetails();
    }
}
