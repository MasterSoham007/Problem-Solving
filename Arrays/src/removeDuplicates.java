class removeDuplicates {
    public static int remove(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        // Test case
        int[] nums = {1, 1, 2, 2, 3, 4, 5, 5, 6};
        int newSize = remove(nums);

        System.out.println("New array size: " + newSize);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
