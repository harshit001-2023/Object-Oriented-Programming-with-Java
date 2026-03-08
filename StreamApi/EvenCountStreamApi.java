/*1. Count_Even_Numbers
Easy
100 points
• 120 min suggested
Problem Description
Write a program to count the even numbers in a given ArrayList by using stream API.

Create an ArrayList to store numbers.

Read the number of elements from the user.

Use a loop to add elements to the ArrayList.

Convert the list into a stream using stream().
Display the number of even numbers.

Examples
Example 1
Input:
Enter number of elements: 5
Enter element: 10
Enter element: 15
Enter element: 20
Enter element: 25
Enter element: 30
Output:
ArrayList Elements: [10, 15, 20, 25, 30]
Number of even numbers: 3
*/

import java.util.ArrayList;

void main(){

    // Created New ArrayList of Integer type
    ArrayList<Integer> list = new ArrayList<>();

    int len = Integer.parseInt(IO.readln()); // Taking length
    for(int i = 0; i < len; i++){
        // Adding elements to the list from user
        list.add(Integer.parseInt(IO.readln()));
    }

    // Printing original arraylist
    IO.println("ArrayList Elements: "+list);

    // Applying logic for Counting Even numbers using Stream Api concepts
    long newList = list.stream().filter(i -> i%2==0).count();

    //Printing new list with Even numbers
    IO.println("Number of even numbers: "+newList);

}

