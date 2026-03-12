package TheCollectionsFrameworks.List;

/*Print Each Grade Using forEach()
Medium
Core Java • List Interface • LinkedList
50 Points
Description
You are given a list of grades entered by the user.
Using Java’s forEach() method, print each grade on a new line in the order they appear in the list.

This task demonstrates the use of internal iteration provided by Java collections.

Input Format

An integer N – number of grades

N strings – grade values

Output Format

Print each grade on a new line.

grade1
grade2
...
Examples
Input

3
A
B
C
Output

A
B
C
Explanation

Given the list:

["A", "B", "C"]


Using:

list.forEach(System.out::println);


The forEach() method iterates over each element internally and prints:

A
B
C


Each element is printed on a separate line.*/

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class GradePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> grades = new LinkedList<>();

        // 1. Read the number of grades
        if (sc.hasNextInt()) {
            int n = Integer.parseInt(IO.readln("Enter number of grades to print: "));
            sc.nextLine(); // Consume newline

            // 2. Read each grade and add to the list
            for (int i = 0; i < n; i++) {
                if (sc.hasNextLine()) {
                    grades.add(IO.readln("Enter grade " + i + ": "));
                }
            }

            // 3. Use forEach() with a Method Reference to print each grade
            // This is the cleanest way to iterate internally
            grades.forEach(System.out::println);
        }

        sc.close();
    }
}