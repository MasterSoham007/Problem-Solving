public class secondOrderElements {
    public static int[] getSecondOrderElements(int n, int[] a) {
        if (n < 2) {
            return new int[0]; // Return an empty array when n < 2
        }

        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] < small) {
                second_small = small;
                small = a[i];
            } else if (a[i] < second_small && a[i] != small) {
                second_small = a[i];
            }

            if (a[i] > large) {
                second_large = large;
                large = a[i];
            } else if (a[i] > second_large && a[i] != large) {
                second_large = a[i];
            }
        }

        // Return an array containing the second smallest and second largest elements
        return new int[]{second_small, second_large};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        int n = arr.length;
        int[] result = getSecondOrderElements(n, arr);

        if (result.length == 0) {
            System.out.println("Array size should be at least 2");
        } else {
            System.out.println("Second smallest is " + result[0]);
            System.out.println("Second largest is " + result[1]);
        }
    }
}
