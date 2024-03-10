import java.util.Arrays;

public class longestConsecutiveSequence {
    public static void main(String[] args) {
        longestConsecutiveSequence solution = new longestConsecutiveSequence();
        int[] nums = {100, 4, 200, 1, 3, 2};
        int longest = solution.longestConsecutive(nums);
        System.out.println("Length of the longest consecutive sequence: " + longest);
    }

    public int longestConsecutive(int[] nums) {
        int cnt = 0;
        int longest = 1;
        int lastSmallest = Integer.MIN_VALUE;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 == lastSmallest) {
                cnt = cnt + 1;
                lastSmallest = nums[i];
            } else if (nums[i] != lastSmallest) {
                lastSmallest = nums[i];
                cnt = 1;
            }

            longest = Math.max(longest, cnt);
        }

        return longest;
    }
}
