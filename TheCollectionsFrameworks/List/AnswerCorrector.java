package TheCollectionsFrameworks.List;

/*Correcting a Wrong Answer in a List
Medium
Core Java • List Interface • LinkedList
50 Points
Description
You are given a list of student answers. One of the answers in the list (at index 1) is incorrect.
Write a Java program to create a list of answer, take the number of answers from user and their values.

Implement the following method:
public static void fixAnswer(List<String> answers)

Method Responsibilities
Replace the element at index 1 in the list with the string "Ans2"
Print the updated list after modificationt

Input Format
First line: Integer N – number of answers
Next N lines: Each line contains an answer (String)

Output Format
Print the updated list after correcting the wrong answer
Examples
Example 1:

Input

3
Ans1
Wrong
Ans3
Output

[Ans1, Ans2, Ans3]
Example 2:

Input

3
A
Incorrect
C
Output

[A, Ans2, C]
Explanation

set(index, value) replaces the element at the given index
It does not add or remove elements
Ideal for correcting or updating existing data*/

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class AnswerCorrector {

    /**
     * Replaces the incorrect answer at index 1 with "Ans2"
     * @param answers The list of student answers
     */
    public static void fixAnswer(List<String> answers) {
        // Check if the list has at least 2 elements to avoid IndexOutOfBoundsException
        if (answers.size() > 1) {
            answers.set(1, "Ans2");
        }
        System.out.println(answers);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> answerList = new LinkedList<>();

        // Read number of answers
        if (sc.hasNextInt()) {
            int n = Integer.parseInt(IO.readln("Enter number of Answers: "));
            sc.nextLine(); // Consume newline

            // Read each answer and add to the list
            for (int i = 0; i < n; i++) {
                if (sc.hasNextLine()) {
                    answerList.add(IO.readln("Enter Answer: "));
                }
            }

            // Correct the answer and print the list
            fixAnswer(answerList);
        }
        sc.close();
    }
}
