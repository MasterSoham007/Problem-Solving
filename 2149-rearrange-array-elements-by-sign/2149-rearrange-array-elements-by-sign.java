class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posInd = 0, negInd = 1;
        int rearranged [] = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                rearranged[negInd] = nums[i];
                negInd = negInd + 2;
            }
            
            else if(nums[i] > 0){ 
                rearranged[posInd] = nums[i];
                posInd = posInd + 2;
            }
        }
        
        return rearranged;
    }
}