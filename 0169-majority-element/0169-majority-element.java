class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer, Integer> mpp = new HashMap<>();
        // int n = nums.length;
        //
        // for(int i = 0; i < n; i++){
        // int value = mpp.getOrDefault(nums[i], 0);
        // mpp.put(nums[i], value + 1);
        // }
        //
        // for(Map.Entry<Integer, Integer> it : mpp.entrySet()){
        // if(it.getValue() > (n/2)){
        // return it.getKey();
        // }
        // }
        int cnt = 0;
        int el = -1;

        for (int i = 0; i < nums.length; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            }

            else if (nums[i] == el) {
                cnt++;
            }

            else {
                cnt--;
            }
        }

        int cnt1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el)
                cnt1++;
        }

        if (cnt1 > (nums.length / 2)) {
            return el;
        }

        return -1;
    }
}