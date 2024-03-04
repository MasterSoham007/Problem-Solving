import java.util.HashMap;

public class longestSubarrayWithSumK1 {
    public static int longestSubarrayWithSumK(int[] a, long k) {

        // Optimal Solution using 2 pointer approach

        int left = 0, right = 0;
        long sum = a[0];
        int maxLen = 0;
        int n = a.length;

        while (right < n) {
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = longestSubarrayWithSumK(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
