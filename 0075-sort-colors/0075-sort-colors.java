class Solution {

    public void swap(int nums[], int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }


    public void sortColors(int[] nums) {
        // int cnt0 = 0, cnt1 = 0, cnt2 = 0;

        // for(int i =0; i < nums.length; i++){
        //     if(nums[i] == 0) cnt0 ++;
        //     else if(nums[i] == 1) cnt1 ++;
        //     else cnt2 ++;
        // }

        // for(int i = 0; i < cnt0; i++) nums[i] = 0;
        // for(int i = cnt0; i < cnt0 + cnt1; i++) nums[i] = 1;
        // for(int i = cnt0 + cnt1; i < nums.length; i++) nums[i] = 2;

        // Optimal solution using Dutch National Flag Algorithm

        int n = nums.length;
        int low = 0, mid = 0, high = n - 1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }

            else{
                swap(nums, mid, high);
                high--;
            }
        }
    }
}