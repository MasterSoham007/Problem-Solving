class Solution {

    public int reversePairs(int[] nums) {
        return mergeSortAndCount(nums, 0, nums.length - 1);
    }

    private int mergeSortAndCount(int[] nums, int low, int high) {
        if (low >= high) return 0;

        int mid = low + (high - low) / 2;
        int count = mergeSortAndCount(nums, low, mid) + mergeSortAndCount(nums, mid + 1, high);
        
        // Counting the number of reverse pairs
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if ((long)nums[left] > 2 * (long)nums[right]) {
                count += mid - left + 1;
                right++;
            } else {
                left++;
            }
        }
        
        // Merge step
        merge(nums, low, mid, high);
        
        return count;
    }

    private void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int idx = 0;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[idx++] = nums[left++];
            } else {
                temp[idx++] = nums[right++];
            }
        }

        while (left <= mid) {
            temp[idx++] = nums[left++];
        }

        while (right <= high) {
            temp[idx++] = nums[right++];
        }

        // Copy back the merged elements to the original array
        System.arraycopy(temp, 0, nums, low, temp.length);
    }
}
