/*
Q1) Create a record called Student, which accepts id, name and marks as a component.
Create an ELC class StudentComparable with main method.
Create a Student array with dynamic size and dynamic array initialization using IO class
Insert at-least 5 Student Object.

Sort the Student Object based on Student Marks.
*/

import java.util.Arrays;

public record Student(int id, String name, double marks) {
}

static void main() {
    try{
        int n = Integer.parseInt(IO.readln("Enter n: "));

        Student[] students = new Student[n];

        for(int i = 0; i < students.length; i++){
            int id = Integer.parseInt(IO.readln("Enter ID: "));
            String name = IO.readln("Enter Name: ");
            double marks = Double.parseDouble(IO.readln("Enter Marks: "));
            students[i] = new Student( id, name, marks);
        }

        IO.println("Original Data Sequence: ");
        for (Student stu : students){
            IO.println(stu);
        }

        Arrays.sort(students, (m1, m2) -> Double.compare(m1.marks(), m2.marks()));
        // Arrays.sort(students, (m1, m2) -> m1.name().compareTo(m2.name()));

        IO.println("Sorted Data: ");
        for(Student stu : students){
            IO.println(stu);
        }


    }catch (NumberFormatException e){
        System.err.println("Enter valid value!");
    }
}
