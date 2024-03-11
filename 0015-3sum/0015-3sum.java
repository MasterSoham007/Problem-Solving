class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
//         Set<List<Integer>> st = new HashSet<>();

//         for(int i = 0; i < nums.length; i++){
//             Set<Integer> hashset = new HashSet<>();
//             for(int j = i+1; j < nums.length; j++){
//                 int third = -(nums[i] + nums[j]);

//                 if(hashset.contains(third)){
//                     List<Integer> temp = Arrays.asList(nums[i] , nums[j], third);
//                     temp.sort(null);
//                     st.add(temp);
//                 }
//                 hashset.add(nums[j]);
//             }
//         }

//         List<List<Integer>> ans = new ArrayList<>(st);

//         return ans;
        
        
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = nums.length - 1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum < 0){
                    j++;
                }

                else if(sum > 0){
                    k--;
                }

                else{
                    List<Integer> temp = Arrays.asList(nums[i] , nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[k] == nums[k+1]) k--;
                }
            }
        }

        return ans;

    }
}