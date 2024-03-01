import java.util.Arrays;

public class moveZerosToEnd {

    public static void swap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static int[] moveZeros(int n, int[] a) {
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1)
            return a;

        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                swap(a, i, j);
                j++;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int n = nums.length;

        System.out.println("Before moving zeros:");
        System.out.println(Arrays.toString(nums));

        int[] result = moveZeros(n, nums);

        System.out.println("After moving zeros:");
        System.out.println(Arrays.toString(result));
    }
}
