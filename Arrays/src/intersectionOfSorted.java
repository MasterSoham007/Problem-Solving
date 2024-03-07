import java.util.ArrayList;

public class intersectionOfSorted {
    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m) {
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr2.get(j) < arr1.get(i)) {
                j++;
            } else {
                ans.add(arr1.get(i));
                i++;
                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(3);
        arr1.add(4);
        arr1.add(6);
        arr1.add(7);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(3);
        arr2.add(5);
        arr2.add(6);

        ArrayList<Integer> result = findArrayIntersection(arr1, arr1.size(), arr2, arr2.size());

        System.out.println("Intersection of sorted arrays:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
