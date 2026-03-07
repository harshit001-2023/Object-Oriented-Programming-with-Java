/*2. ReverseStackBasic
Easy
100 points
• 120 min suggested
Problem Description
Write a program to reverse the elements of a Stack.
The program creates two stacks:

Original stack

Temporary stack

Elements are popped from the original stack.

Each popped element is pushed into the temporary stack.

Because stack operations are LIFO, the order automatically becomes reversed.

Import Packages
Create a method reverseStack() that accepts a stack.

Create an empty temporary stack.

While the original stack is not empty:

Pop an element from the original stack.

Push it into the temporary stack.

Return the temporary stack.

Ask the user to enter the number of elements.
Display the original stack.

Call reverseStack() to reverse the elements.

Display the reversed stack.

Examples
Example 1
Input:
Enter number of elements in stack: 4
Enter element: 10
Enter element: 20
Enter element: 30
Enter element: 40
Output:
Original Stack: [10, 20, 30, 40]
Reversed Stack: [40, 30, 20, 10]*/

import java.util.Stack;

void main(){
    Stack<Integer> stack = new Stack<>();
    int len = Integer.parseInt(IO.readln());

    for (int i = 0; i < len; i++) {
        stack.push(Integer.parseInt(IO.readln()));
    }
    IO.println("Original Stack: "+stack);
    IO.println("Reversed Stack: " + reverseStack(stack, len));
}

public static Stack<Integer> reverseStack(Stack<Integer> stack, int len) {
    Stack<Integer> temp = new Stack<>();
    for (int i = 0; i < len; i++) {
        temp.push(stack.pop());
    }
    return temp;
}
