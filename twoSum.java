import java.util.HashMap;

class twoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];

            if (mpp.containsKey(rem)) {
                return new int[] {i, mpp.get(rem)};
            }

            if (!mpp.containsKey(nums[i])) {
                mpp.put(nums[i], i);
            }
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        twoSum solution = new twoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices of the two numbers whose sum is equal to the target:");
        System.out.println(result[0] + " " + result[1]);
    }
}
