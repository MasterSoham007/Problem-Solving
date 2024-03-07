import java.util.*;

public class leadersInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> result = superiorElements(arr);
        System.out.println("Superior elements in the array: " + result);
    }

    public static List<Integer> superiorElements(int[] a) {
        int maxi = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] > maxi) {
                maxi = a[i];
                ans.add(maxi);
            }
        }

        Collections.sort(ans);
        return ans;
    }
}
