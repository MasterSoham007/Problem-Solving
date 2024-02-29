import java.util.ArrayList;

public class leftRotateByKplaces{
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();

        if (n == 0) return arr;

        k = k % n;

        if (k == 0) return arr;

        ArrayList<Integer> temp = new ArrayList<>(arr.subList(0, k));

        arr.subList(0, k).clear();
        arr.addAll(temp);

        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int rotations = 2; // Number of rotations

        System.out.println("Original Array: " + arr);
        rotateArray(arr, rotations);
        System.out.println("Array after " + rotations + " left rotation(s): " + arr);
    }
}
