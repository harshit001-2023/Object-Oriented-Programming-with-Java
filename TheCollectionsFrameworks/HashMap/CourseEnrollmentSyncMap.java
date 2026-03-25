package TheCollectionsFrameworks.HashMap;

/*CourseEnrollmentSyncMap
Easy
Core Java • Advanced Maps • synchronized HashMap
20 Points
Description
You are developing a simple course enrollment system for an online training platform.
Each course has a unique course ID and a corresponding course name. Since multiple users
may access the enrollment data at the same time, the system must ensure thread-safe access
to the course records. To achieve this, you must use a synchronized HashMap. The application
should store course details, display all available courses, and allow searching for a course
using its course ID.

Class Details
Create a Course class with data members courseId of type int and courseName of type String.
Provide a parameterized constructor to initialize these values. Override the toString method
to return course details in the format: Course ID: <courseId>, Course Name: <courseName>.

Create a main class named CourseEnrollmentSyncMap. In the main method, accept user input,
create a HashMap<Integer, Course>, convert it into a synchronized map using Collections.
synchronizedMap, add course objects into the map, display all course records, and retrieve
a course based on the course ID entered by the user.

Input Details
The first input is the number of courses. For each course, the course ID and course name
are entered. Finally, a course ID is entered to search for a specific course.
Examples
Input

Enter number of courses:
3
Enter course ID:
101
Enter course name:
Java Basics
Enter course ID:
102
Enter course name:
Spring Framework
Enter course ID:
103
Enter course name:
Data Structures
Enter course ID to search:
102
Output

Course List:
Course ID: 101, Course Name: Java Basics
Course ID: 102, Course Name: Spring Framework
Course ID: 103, Course Name: Data Structures

Search Result:
Course ID: 102, Course Name: Spring Framework
Explanation

This program introduces the concept of a synchronized
HashMap by wrapping a normal HashMap using Collections.synchronizedMap. It demonstrates safe storage and retrieval of data in scenarios where multiple threads may access the map concurrently. The example helps beginners understand basic synchronization support in Java collections without dealing directly with thread implementation.
Constraints
Course ID must be a positive integer. Course name must not be null or empty.
Null keys and null values are not allowed.*/

import java.util.*;

class Course {
    private int courseId;
    private String courseName;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Course Name: " + courseName;
    }
}

public class CourseEnrollmentSyncMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create synchronized map
        Map<Integer, Course> syncMap = Collections.synchronizedMap(new HashMap<>());

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                if (scanner.hasNextInt()) {
                    int courseId = scanner.nextInt();
                    if(courseId < 0) {
                        IO.println("Invalid course ID");
                        System.exit(0);
                    }
                    scanner.nextLine(); // CRITICAL: Consume the leftover newline (\n)

                    String courseName = scanner.nextLine(); // Read full name with spaces
                    syncMap.put(courseId, new Course(courseId, courseName));
                }
            }
        }


        // Display all records
        displayAllRecords(syncMap);

        // Retrieve a course
        if (scanner.hasNextInt()) {
            int courseIdToRetrieve = scanner.nextInt();
            retrieveCourse(syncMap, courseIdToRetrieve);
        } else {
            // Handle cases where non-numeric input is provided for retrieval
            System.out.println("Invalid course ID.");
        }

        scanner.close();
    }

    public static void displayAllRecords(Map<Integer, Course> map) {
        // Iterating over a synchronized map must be done inside a synchronized block
        synchronized (map) {
            for (Course course : map.values()) {
                System.out.println(course);
            }
        }
    }

    public static void retrieveCourse(Map<Integer, Course> map, int id) {
        Course course = map.get(id);
        if (course != null) {
            System.out.println(course);
        } else {
            // Test Case 3 logic: If ID is invalid/not found
            System.out.println("Course with ID " + id + " not found.");
        }
    }
}
