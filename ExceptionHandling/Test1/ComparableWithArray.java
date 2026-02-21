package ExceptionHandling.Test1;//3. ExceptionHandling.Test1.ComparableWithArray
//        Easy
//100 points
//• 125 min suggested
//Problem Description
//Write a Java program to create a Student class with rollNo, name, and marks variables. Implement the Comparable interface to sort the list of students by their name in ascending order.
//
//A college wants to maintain a list of students and their academic details. Each student has:
//
//Roll Number (rollNo) – an integer representing the unique identifier
//
//Name (name) – a string representing the student’s name
//
//Marks (marks) – a double representing marks scored
//
//The college wants to display the list of students in alphabetical order of their names, so that it is easier to search and maintain records.
//
//Examples
//Example 1
//Input:
//enter the size: 5
//
//Enter details for Student 1:
//Enter Roll Number: 103
//Enter Name: John
//Enter Marks: 85.5
//
//Enter details for Student 2:
//Enter Roll Number: 101
//Enter Name: Alice
//Enter Marks: 92.0
//
//Enter details for Student 3:
//Enter Roll Number: 105
//Enter Name: Bob
//Enter Marks: 78.5
//
//Enter details for Student 4:
//Enter Roll Number: 102
//Enter Name: Charlie
//Enter Marks: 88.0
//
//Enter details for Student 5:
//Enter Roll Number: 104
//Enter Name: David
//Enter Marks: 91.5
//Output:
//Students before sorting (by insertion order):
//        ==============================================
//Student [rollNo=103, name=John, marks=85.5]
//Student [rollNo=101, name=Alice, marks=92.0]
//Student [rollNo=105, name=Bob, marks=78.5]
//Student [rollNo=102, name=Charlie, marks=88.0]
//Student [rollNo=104, name=David, marks=91.5]
//
//Students after sorting by name (ascending order):
//        ===================================================
//Student [rollNo=101, name=Alice, marks=92.0]
//Student [rollNo=105, name=Bob, marks=78.5]
//Student [rollNo=102, name=Charlie, marks=88.0]
//Student [rollNo=104, name=David, marks=91.5]
//Student [rollNo=103, name=John, marks=85.5]
//Explanation:
//Requirements: Student Class: Must have private variables: rollNo, name, and marks. Must have a constructor to initialize these variables. Must have getter methods for all variables. Implement the Comparable<Student> interface to sort by name in ascending order. Override toString() method to display student details in a readable format. Comparable Interface: The compareTo() method must compare the name of two students to determine order. Sorting should be alphabetical (ascending). Main Program: Student[] stu=new Student[size]; Accept the number of students from the user. Accept student details (rollNo, name, marks) from the user for each student. Display the list of students before sorting. Sort the students with their names Display the list of students after sorting by name.
//
//        ANS
//---------------------------------


import java.util.Arrays;

record Student1(int rollNo, String name, double marks)implements Comparable<Student1>
{
    public int compareTo(Student1 x)
    {
        return this.name.compareTo(x.name);
    }

}
public class ComparableWithArray
{
    public static void main(String[]args)
    {
        int size=Integer.parseInt(IO.readln());
        Student1 []call=new Student1[size];
        for(int i=0;i<size;i++)
        {
            int id=Integer.parseInt(IO.readln());
            String name=IO.readln();
            double marks=Double.parseDouble(IO.readln());
            call[i]=new Student1(id,name,marks);


        }
        IO.println("Students before sorting (by insertion order):");
        for(Student1 e:call)
        {
            IO.println(e);
        }
        Arrays.sort(call);
        IO.println("\nStudents after sorting by name (ascending order):");
        for(Student1 d: call)
        {
            IO.println(d);
        }
    }
}