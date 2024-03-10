import java.util.HashMap;
import java.util.Map;

public class countSubarraySumEqualsK {
    public static void main(String[] args) {
        countSubarraySumEqualsK solution = new countSubarraySumEqualsK();
        
        int[] nums = {1, 2, 3, 4, 5};
        int k = 5;
        
        int result = solution.subarraySum(nums, k);
        
        System.out.println("Number of subarrays with sum " + k + ": " + result);
    }

    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0, preSum = 0;
        Map<Integer, Integer> mpp = new HashMap<>();

        mpp.put(0, 1);
        for (int i = 0; i < n; i++) {
            preSum += nums[i];
            int remain = preSum - k;
            cnt += mpp.getOrDefault(remain, 0);
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }
}
