class maxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxi = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                count = 0;
            }

            maxi = Math.max(count, maxi);
        }

        return maxi;
    }

    public static void main(String[] args) {
        maxConsecutiveOnes solution = new maxConsecutiveOnes();
        int[] nums = {1, 1, 0, 1, 1, 1, 0, 1, 1}; // Example input array
        int maxConsecutiveOnes = solution.findMaxConsecutiveOnes(nums);
        System.out.println("The maximum consecutive ones are: " + maxConsecutiveOnes);
    }
}
