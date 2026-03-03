/*Longest Consecutive Sequence
hard
Core Java • Array • 1D array
50 Points
Description
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4

Example 2:
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9

Example 3:
Input: nums = [1,0,1,2]
Output: 3
Examples
Example 1:

Input

6
100
4
200
1
3
2
Output

4
Example 2:

Input

10
0
3
7
2
5
8
4
6
0
1
Output

9
Explanation

Track consecutive sequences by checking for the start of a sequence and count length.*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

void main() {
    Scanner sc = new Scanner(System.in);

    // Read input size
    if (!sc.hasNextInt()) return;
    int n = sc.nextInt();
    int[] nums = new int[n];

    // Read array elements
    for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
    }

    IO.println(findLongestConsecutive(nums));
}

public static int findLongestConsecutive(int[] nums) {
    if (nums.length == 0) return 0;

    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
        set.add(num);
    }

    int longestStreak = 0;

    for (int num : set) {
        // Check if 'num' is the start of a sequence
        if (!set.contains(num - 1)) {
            int currentNum = num;
            int currentStreak = 1;

            // Count how many consecutive numbers follow
            while (set.contains(currentNum + 1)) {
                currentNum += 1;
                currentStreak += 1;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
        }
    }

    return longestStreak;
}
