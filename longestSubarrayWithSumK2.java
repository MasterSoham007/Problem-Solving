import java.util.*;

public class longestSubarrayWithSumK2 {
    public static int getLongestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> preSumMap = new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            int rem = sum - k;

            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 1, 9};
        int k = 10;
        int len = getLongestSubarray(nums, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
