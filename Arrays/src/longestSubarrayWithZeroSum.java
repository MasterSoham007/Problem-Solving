import java.util.HashMap;

public class longestSubarrayWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -3, 4, 1, -1, -1, 0, 6, -5, 4};
        System.out.println("Longest zero sum subarray length: " + getLongestZeroSumSubarrayLength(arr));
    }

    public static int getLongestZeroSumSubarrayLength(int[] arr) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        int maxi = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxi = i + 1;
            } else {
                if (mpp.containsKey(sum)) {
                    maxi = Math.max(maxi, i - mpp.get(sum));
                } else {
                    mpp.put(sum, i);
                }
            }
        }

        return maxi;
    }
}
