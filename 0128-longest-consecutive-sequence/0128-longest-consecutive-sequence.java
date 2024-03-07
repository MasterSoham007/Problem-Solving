class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 1;

        if(nums.length == 0){
            return 0;
        }

        Set<Integer> st = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            st.add(nums[i]);
        }

        for(int it : st){
            if(!st.contains(it - 1)){
                int cnt = 1;
                int x = it;
                while(st.contains(x + 1)){
                    x = x+1;
                    cnt = cnt + 1;
                }

                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }
}