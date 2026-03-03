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
