class Solution {
    public int removeDuplicates(int[] nums) {
        // Brute Force

        // HashSet<Integer> set = new HashSet<>();

        // for (int num : nums) {
        //     set.add(num);
        // }

        // int k = set.size();
        // int index = 0;
        // for (int x : set) {
        //     nums[index] = x;
        //     index++;
        // }

        // return k;

        // Optimal Approach

        int i =0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }

        return i+1;
    }
}