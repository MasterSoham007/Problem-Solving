import java.util.ArrayList;
import java.util.List;

public class unionOfSorted {
    public static List<Integer> sortedArray(int[] a, int[] b) {

        // Optimal Solution using 2 pointer approach

        ArrayList<Integer> union = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != a[i]) {
                    union.add(a[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != b[j]) {
                    union.add(b[j]);
                }
                j++;
            }
        }

        while (i < a.length) {
            if (union.get(union.size() - 1) != a[i]) {
                union.add(a[i]);
            }
            i++;
        }

        while (j < b.length) {
            if (union.get(union.size() - 1) != b[j]) {
                union.add(b[j]);
            }
            j++;
        }

        return union;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 5, 6, 8};

        List<Integer> result = sortedArray(a, b);

        System.out.println("Union of arrays:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
