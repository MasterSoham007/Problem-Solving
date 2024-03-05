class Solution {

    // Brute Force
    // public void rotate(int[] nums, int k) {
    // int n = nums.length;

    // if(n == 0) return;

    // k = k % n;

    // if(k == 0) return;

    // int temp[] = new int[k];

    // for(int i = 0; i < k; i++){
    // temp[i] = nums[(n - k) + i];
    // }

    // for(int i = n-1; i >= k; i--){
    // nums[i] = nums[i - k];
    // }

    // for(int i = 0; i < k; i++){
    // nums[i] = temp[i];
    // }
    // }

    // Optimal approach without extra space

    public void reverse(int nums[], int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int nums[], int k) {
        int n = nums.length;

        if (n == 0)
            return;

        k = k % n;

        if (k == 0)
            return;

        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - k - 1);
        reverse(nums, 0, n - 1);
    }
}