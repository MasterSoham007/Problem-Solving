import java.util.ArrayList;
import java.util.List;

public class majorityElement2 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        List<Integer> result = majorityElement(nums);
        System.out.println("Result: " + result);
    }

    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        int mini = (int) (n / 3) + 1;

        int cnt1 = 0, cnt2 = 0;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && nums[i] != el2) {
                cnt1 = 1;
                el1 = nums[i];
            } else if (cnt2 == 0 && nums[i] != el1) {
                cnt2 = 1;
                el2 = nums[i];
            } else if (el1 == nums[i]) cnt1++;
            else if (el2 == nums[i]) cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == el1) cnt1++;
            if (nums[i] == el2) cnt2++;
        }

        if (cnt1 >= mini) ans.add(el1);
        if (cnt2 >= mini) ans.add(el2);

        return ans;
    }
}
