package TheCollectionsFrameworks.Deque;

/*Retrieve First Customer Token Without Removing Using getFirst()
Easy
Core Java • List Interface • LinkedList
20 Points
Description
A bakery issues a token to each customer. The first customer in the queue should always be served first.

Your task is to write a Java program that:
Accepts the current token queue
Retrieves the first token without removing it using getFirst()
Prints the first token
Prints the entire queue afterward to confirm it is unchanged
Use a Deque implementation.

Input Format
Integer N – number of customers in the queue
N integers – token numbers in the queue (in order of arrival)

Output Format
First token: <token>
Queue after getFirst(): [token1, token2, ...]
Examples
Example 1:

Input

3
101 102 103
Output

First token: 101
Queue after getFirst(): [101, 102, 103]
Example 2:

Input

3
101 102 103
Output

First token: 101
Queue after getFirst(): [101, 102, 103]
Explanation

Example queue:

[101, 102, 103]


Using getFirst():

Retrieves 101 without removing it

Queue remains [101, 102, 103]*/

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Deque;

public class TokenSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize Deque using LinkedList implementation
        Deque<Integer> queue = new LinkedList<>();

        // Read number of customers
        if (sc.hasNextInt()) {
        IO.println("Enter a number of customer: ");
            int n = sc.nextInt();

            // Read token numbers and add to queue
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt()) {
                    queue.add(Integer.valueOf(IO.readln("Enter a token number")));
                }
            }

            // Check if queue is not empty before calling getFirst()
            if (!queue.isEmpty()) {
                int firstToken = queue.getFirst();
                System.out.println("First token: " + firstToken);
                System.out.println("Queue after getFirst(): " + queue);
            } else {
                System.out.println("Queue is empty.");
                System.out.println("Queue after getFirst(): " + queue);
            }
        }
        sc.close();
    }
}
