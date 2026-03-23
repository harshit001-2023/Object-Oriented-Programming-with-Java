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

import java.util.*;

public class CourseRegistrations {
    public static void main(String[] args) {
        // Map: Key = Course Name (String), Value = List of Students (ArrayList)
        HashMap<String, List<String>> studentCourse = new HashMap<>();

        int choice;
        do {
            IO.println("\n--- Course Registration Menu ---");
            IO.println("1. Register student to course");
            IO.println("2. Remove student from course");
            IO.println("3. View course-wise student list");
            IO.println("4. Exit");

            try {
                choice = Integer.parseInt(IO.readln("\nEnter your choice: "));

                switch (choice) {
                    case 1:
                        String stName = IO.readln("Enter student name: ");
                        String courseName = IO.readln("Enter course name: ");

                        // computeIfAbsent: If the course key doesn't exist, it runs the mapping function
                        // (creates a new ArrayList), puts it in the map, and then we add the student.
                        studentCourse.computeIfAbsent(courseName, k -> new ArrayList<>()).add(stName);
                        IO.println("Student added successfully.");
                        break;

                    case 2:
                        String removeStudent = IO.readln("Enter student name: ");
                        String courseToEdit = IO.readln("Enter course name: ");

                        // Check if the course exists first to avoid NullPointerExceptions
                        if (studentCourse.containsKey(courseToEdit)) {
                            // computeIfPresent: If the key exists, it provides the current list (v).
                            // We remove the student from that list.
                            studentCourse.computeIfPresent(courseToEdit, (k, v) -> {
                                if (v.remove(removeStudent)) {
                                    IO.println("Student removed.");
                                } else {
                                    IO.println("Student not found in this course.");
                                }
                                return v; // Keep the list in the map
                            });
                        } else {
                            IO.println("Error: Course '" + courseToEdit + "' does not exist.");
                        }
                        break;

                    case 3:
                        if (studentCourse.isEmpty()) {
                            IO.println("No registrations found.");
                        } else {
                            // Standard iteration over the Map entries
                            studentCourse.forEach((course, students) -> {
                                IO.println(course + " : " + students);
                            });
                        }
                        break;

                    case 4:
                        IO.println("Exiting system...");
                        return; // Cleaner than System.exit(0) in a main method

                    default:
                        IO.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                IO.println("Input Error: Please enter a valid number for the menu choice.");
            }

        } while (true);
    }
}
