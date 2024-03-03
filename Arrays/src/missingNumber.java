public class missingNumber {
    public int missingNumber(int[] nums) {
        int N = nums.length;
        int XOR1 = 0;
        int XOR2 = 0;

        for (int i = 0; i < N; i++) {
            XOR1 = XOR1 ^ nums[i];
            XOR2 = XOR2 ^ (i + 1);
        }

        return XOR1 ^ XOR2;
    }

    public static void main(String[] args) {
        missingNumber missingNumObj = new missingNumber();
        int[] nums = {3, 0, 1, 4, 6, 2}; // Example input array
        int missingNum = missingNumObj.missingNumber(nums);
        System.out.println("The missing number is: " + missingNum);
    }
}
