class Solution {
    public int longestConsecutive(int[] nums) {
//        int longest = 1;
//
        if(nums.length == 0){
            return 0;
        }
//
//        Set<Integer> st = new HashSet<>();
//        for(int i = 0; i < nums.length; i++){
//            st.add(nums[i]);
//        }
//
//        for(int it : st){
//            if(!st.contains(it - 1)){
//                int cnt = 1;
//                int x = it;
//                while(st.contains(x + 1)){
//                    x = x+1;
//                    cnt = cnt + 1;
//                }
//
//                longest = Math.max(longest, cnt);
//            }
//        }
//
//        return longest;

        int cnt = 0;
        int longest = 1;
        int lastSmallest = Integer.MIN_VALUE;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(nums[i] - 1 == lastSmallest){
                cnt = cnt + 1;
                lastSmallest = nums[i];
            }
            else if(nums[i] != lastSmallest){
                lastSmallest = nums[i];
                cnt = 1;
            }


            longest = Math.max(longest, cnt);
        }

        return longest;
    }
}