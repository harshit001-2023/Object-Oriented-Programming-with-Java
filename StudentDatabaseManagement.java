/*Create a Scenario based program on Student Management System using HashMap where we need to Add Student, Update Marks, Delete Student, Search Student, Display All Students, Show Lowest Scorer, Show Total and Average Marks.

Coding Requirements :
---------------------
Take an ELC class StudentDataManagement with main method.

In this main method create one HashMap object which takes Student name as a key and Student marks as a value.

Create IO class object perform various operation on Student object by using switch case.

------ Student Management Menu ------
1. Add Student
2. Update Marks
3. Delete Student
4. Search Student
5. Display All Students
6. Show Topper
7. Show Lowest Scorer
8. Show Total and Average Marks
9. Exit
Enter your choice:


Test Cases for Output :
-----------------------
Test Case 1 :
-------------
Enter your choice: 1
Enter student name: Ankit
Enter marks: 89
Student added successfully!



Test Case 2 :
-------------
Enter your choice: 2
Enter student name to update the marks : Ankit
Enter new marks: 93
Marks updated.


Test Case 3:
-------------
Enter your choice: 3
Enter student name to delete: Ankit
Student deleted.


Test Case 4:
------------
Enter your choice: 4
Enter student name to search: Elina
Elina scored 99


Test Case 5:
------------
Enter your choice: 5
---- Student Records ----
Ravishankar => 99
Puja  => 89
Elina => 99
Aryan => 98


Test Case 6:
------------
Enter your choice: 6
Topper: Ravishankar => 99


Test Case 7:
------------
Enter your choice: 7
Lowest Scorer: Puja  => 89

Test Case 8:
------------
Enter your choice: 8
Total Marks: 385
Average Marks: 96.25

Test Case 9:
-------------
Enter your choice: 9
Exiting... Thank you!


Test Cases for Input Validation :
----------------------------------
Enter your choice: 2
Enter student name to update the marks : Ankit
Student not found.
*/

import java.util.HashMap;

public class StudentDatabaseManagement {
    public static void main(String[] args) {
        HashMap<String, Double> students = new HashMap<>();
        int choice = Integer.parseInt(IO.readln("Enter choice: "));

        switch (choice) {
            case 1:
                String name = IO.readln("Please enter the Name");
                double marks = Double.parseDouble(IO.readln("Enter Marks of the Student: "));
                students.put(name, marks);
                break;
            case 2:
                String newName = IO.readln("Please enter the Name of the Student: ");
                double newMarks = Double.parseDouble(IO.readln("Enter Marks of the Student: "));
                students.put(newName, newMarks);
                break;

        }

    }
}
