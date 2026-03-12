package TheCollectionsFrameworks.Deque;

/*TaskManagerOfferFirst
Easy
Core Java • List Interface • LinkedList
20 Points
Description
In a double-ended task manager, urgent tasks are added to the front.

Write a Java program to store tasks in a Deque<String> implemented with LinkedList.
Read the number of existing tasks and their names from the user using a for loop.
Provide a user-defined method that adds an urgent task to the beginning of the deque using the offerFirst() method.
In the main method, create the deque, read all tasks, call the user-defined method to add the urgent task, and display the updated tasks.

User-Defined Method Signature
public static void addUrgentTask(Deque<String> tasks, String urgentTask)

Tasks are stored in a deque in the order they are added.
Examples
Example 1:

Input

Enter number of tasks: 2
Enter task 1: T2
Enter task 2: T3
Enter urgent task: T1
Output

Updated tasks: [T1, T2, T3]
Example 2:

Input

Enter number of tasks: 1
Enter task 1: T5
Enter urgent task: T4
Output

Updated tasks: [T4, T5]
Explanation

*/

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Deque;

public class TaskManager {

    // User-defined method to add an urgent task to the front
    public static void addUrgentTask(Deque<String> tasks, String urgentTask) {
        tasks.offerFirst(urgentTask);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> taskDeque = new LinkedList<>();

        // 1. Read the number of existing tasks
        int n = Integer.parseInt(IO.readln("Enter number of tasks: "));
        sc.nextLine(); // Consume the leftover newline character

        // 2. Read task names and add to the end of the deque
        for (int i = 1; i <= n; i++) {
            taskDeque.addLast(IO.readln("Enter Tasks"));
        }

        // 3. Read the urgent task
        String urgent = IO.readln("Enter urgent task: ");

        // 4. Call the user-defined method
        addUrgentTask(taskDeque, urgent);

        // 5. Display the updated tasks
        System.out.println("Updated tasks: " + taskDeque);

        sc.close();
    }
}

