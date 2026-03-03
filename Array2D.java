/*InputAndPrintMatrix
Easy
Core Java • Array • 2D Array
20 Points
Description
Write a Java program to input a 2D array (3x3 matrix) from the user and display it in matrix form.
This program helps understand the basics of 2D array input and output.

Input:
- 9 integer elements representing a 3x3 matrix

Output:
- Print the matrix in 3 rows and 3 columns

Example:
Input:
1 2 3
4 5 6
7 8 9

Output:
Matrix:
1 2 3
4 5 6
7 8 9
Examples
Example 1:

Input

1
2
3
4
5
6
7
8
9
Output

Matrix:
1 2 3
4 5 6
7 8 9
Example 2:

Input

10
20
30
40
50
60
70
80
90
Output

Matrix:
10 20 30
40 50 60
70 80 90*/

import java.util.*;

class Array2D {
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];

        // Use Scanner for proper input handling
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // Read integer directly using Scanner
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Close the scanner
        scanner.close();

        System.out.println("Matrix:");
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Add a newline for better formatting
        }

//        for (int[] ints : matrix) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println(); // Add a newline for better formatting
//        }

    }
}
