class arrayIsSortedAndRotated {
    public static boolean check(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
        }

        if(count <= 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println("Result for nums1: " + check(nums1)); // Output: true

        int[] nums2 = {2, 1, 3, 4};
        System.out.println("Result for nums2: " + check(nums2)); // Output: false
    }
}
