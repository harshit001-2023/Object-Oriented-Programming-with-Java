package TheCollectionsFrameworks.HashMap;

/*
Create a Scenario based program on Course Registration System using HashMap where multiple students can be added in a particular course.
[See the Test cases].

In the HashMap, Course Name will be the HashMap key, where as List<String>
will become HashMap value.

Coding Requirements :
---------------------
Take an ELC class CourseRegistration with main method.

In this main method create one HashMap object which takes Course name(String) as a key and Students name (List<String>) as a value.

Create Scanner class object to perform various operation on CourseRegistration system by using switch case.


--- Course Registration Menu ---
1. Register student to course [use V computeIfAbsent(key, Function<T,R>)]
2. Remove student from course [use V computeIfPresent(key, BiFunction<T,U,R>)]
3. View course-wise student list
4. Exit
Enter your choice:


Test Cases for Output :
-----------------------
Test Case 1 :
-------------
--- Course Registration Menu ---
1. Register student to course
2. Remove student from course
3. View course-wise student list
4. Exit
Enter your choice: 1
Enter course name: Java
Enter student name: Raj
Raj registered to Java

--- Course Registration Menu ---
1. Register student to course
2. View course-wise student list
3. Remove student from course
4. Exit
Enter your choice: 2

 Course → Students List:
Java → [Ravi, Ankita, Sneha]
HTML → [Raj, Rohit]
Python → [Scott, Smith]

--- Course Registration Menu ---
1. Register student to course
2. View course-wise student list
3. Remove student from course
4. Exit
Enter your choice: 3
Enter course name: HTML
Enter student name to remove: Raj
Raj : has removed from HTML

--- Course Registration Menu ---
1. Register student to course
2. View course-wise student list
3. Remove student from course
4. Exit
Enter your choice: 4
Exiting Course Registration System.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

import java.util.*;

public class CourseRegistrations {
    public static void main(String[] args) {
        // Map to store Course Name as key and a List of Student Names as the value
        HashMap<String, List<String>> studentCourse = new HashMap<>();

        int choice;
        do {
            IO.println("--- Course Registration Menu ---");
            IO.println("1. Register student to course [use V computeIfAbsent(key, Function<T,R>)]");
            IO.println("2. Remove student from course [use V computeIfPresent(key, BiFunction<T,U,R>)]");
            IO.println("3. View course-wise student list");
            IO.println("4. Exit");
            IO.println();

            try {
                choice = Integer.parseInt(IO.readln("Enter your choice: "));

                switch (choice) {
                    case 1:
                        String stName = IO.readln("Enter student name: ");
                        String courseName = IO.readln("Enter course name: ");

                        // If the course doesn't exist, create a new ArrayList.
                        // Then, add the student name to the list associated with that course.
                        studentCourse.computeIfAbsent(courseName, key -> new ArrayList<>()).add(stName);
                        break;

                    case 2:
                        String removeStudent = IO.readln("Enter student name: ");
                        String courseToEdit = IO.readln("Enter course name: ");

                        // computeIfPresent checks if the course exists.
                        // If it does, it returns the list (V), and we immediately call .remove() on it.
                        // Objects.requireNonNull prevents a crash if the course key isn't found.
                        Objects.requireNonNull(studentCourse.computeIfPresent(courseToEdit, (K, V) -> V))
                                .remove(removeStudent);
                        break;

                    case 3:
                        // Iterate through the map and print each course with its registered students
                        for (String key : studentCourse.keySet()) {
                            IO.println(key + " : " + studentCourse.get(key));
                        }
                        break;

                    case 4:
                        IO.println("System exited...");
                        System.exit(0);
                        break;

                    default:
                        IO.println("Invalid choice.");
                }
            } catch (NumberFormatException | NullPointerException e) {
                // Catches non-integer inputs or attempts to remove students from non-existent courses
                System.err.println("Enter suitable value...");
            }

        } while (true);
    }
}
