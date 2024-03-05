public class isArraySorted {
    public static int isSorted(int n, int[] a) {
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) { // Changed condition to check for strictly decreasing order
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 2, 1};

        System.out.println("isSorted(arr1): " + isSorted(arr1.length, arr1)); // Output: 1
        System.out.println("isSorted(arr2): " + isSorted(arr2.length, arr2)); // Output: 0
    }
}
