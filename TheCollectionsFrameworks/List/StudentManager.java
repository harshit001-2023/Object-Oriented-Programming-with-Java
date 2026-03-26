/*StudentNameManager
Easy
Core Java • Collection Framework Overview • Collection interface
20 Points
Description
You are building a system to store student names. You need to add, display, and check if a student is in the list using List methods.

Class Name: StudentManager
Objects:
StudentManager manager -> manages the list of student names.
Variables (Instance Variables):
ArrayList<String> students -> stores student names.

Methods:
void addStudent(String name) -> adds a student to the list.
boolean checkStudent(String name) -> returns true if student exists (contains() method).
void displayStudents() -> displays all students using for-each loop.

Collections Used:
ArrayList<String> -> implements List, preserves order, supports all List methods.

Main Method:
Class containing main: StudentNameManager
Read number of students.
Loop to read student names -> call addStudent().
Call displayStudents().
Read a name to check -> call checkStudent() and print result.
Examples
Example 1:

Input

Enter number of students: 3
Enter name 1: Alice
Enter name 2: Bob
Enter name 3: Charlie
Enter name to check: Bob
Output

Alice
Bob
Charlie
Bob exists in the list
Example 2:

Input

Enter number of students: 2
Enter name 1: John
Enter name 2: Mary
Enter name to check: David
Output

John
Mary
David does not exist in the list
Explanation

Read the number of students.
Add each student to the ArrayList using add().
Display all students using for-each.
Check if a student exists using contains().*/

import java.util.*;

public static class StudentManager{
    private ArrayList<String> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    void addStudent(String name){
        if (name != null && !name.trim().isEmpty()) {
            students.add(name);
        }
    }

    boolean checkStudent(String name){
        return students.contains(name);
    }

    void displayStudents(){
        for(String student : students){
            IO.println(student);
        }
    }
}

void main(){
    StudentManager stm = new StudentManager();

    int n = Integer.parseInt(IO.readln());
    for(int i = 0; i < n; i++){
        String name = IO.readln();
        stm.addStudent(name);
    }
    String name = IO.readln();
    stm.displayStudents();
    if(stm.checkStudent(name)) IO.println(name+" exists in the list");
    else IO.println(name+" does not exist in the list");


}

