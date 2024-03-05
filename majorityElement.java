public class majorityElement {
    public static int majorityElement(int[] v) {
        int cnt = 0;
        int el = -1;

        for (int i = 0; i < v.length; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = v[i];
            } else if (v[i] == el) {
                cnt++;
            } else {
                cnt--;
            }
        }

        int cnt1 = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == el)
                cnt1++;
        }

        if (cnt1 > (v.length / 2)) {
            return el;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int result = majorityElement(array);
        if (result != -1) {
            System.out.println("The majority element is: " + result);
        } else {
            System.out.println("There is no majority element in the array.");
        }
    }
}
