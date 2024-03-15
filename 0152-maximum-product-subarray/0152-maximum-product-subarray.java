class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;

        int pre = 1, suff = 1;

        for(int i = 0; i < n; i++){
            pre = pre * nums[i];
            suff = suff * nums[n - i - 1];

            maxi = Math.max(maxi, Math.max(pre, suff));

            if(pre == 0) pre = 1;
            if(suff == 0) suff = 1; 
        }

        return maxi;
    }
}