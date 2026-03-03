/*MaximumElementJaggedArray
Medium
Core Java • Array • Jagged Array
50 Points
Description
Find and print the maximum element in a jagged array.

[[1], [2,3], [4,5,6]] ->6
[[10], [20,30], [40,50,60]] ->60
Examples
Example 1:

Input

Enter number of rows:
3
Enter number of elements in row 1:
1
Enter elements:
1
Enter number of elements in row 2:
2
Enter elements:
2 3
Enter number of elements in row 3:
3
Enter elements:
4 5 6
Output

Maximum element = 6
Example 2:

Input

Enter number of rows:
2
Enter number of elements in row 1:
1
Enter elements:
10
Enter number of elements in row 2:
3
Enter elements:
20 30 40
Output

Maximum element = 40
Explanation

Iterate each element; compare to find maximum*/

import java.util.Scanner;

public class MaximumElementJaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int[][] jaggedArray = new int[rows][];

        // Initialize max with a very small value
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {
            int cols = sc.nextInt();
            jaggedArray[i] = new int[cols];

            for (int j = 0; j < cols; j++) {
                jaggedArray[i][j] = sc.nextInt();
                // Update max during input to be efficient
                if (jaggedArray[i][j] > max) {
                    max = jaggedArray[i][j];
                }
            }
        }
        if(max < 0) System.out.println("Invalid input");
        else
            System.out.println("Maximum element = " + max);
    }
}


