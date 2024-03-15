import java.util.ArrayList;
import java.util.HashMap;

public class subarraysWithGivenXORk {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(4);
        A.add(2);
        A.add(2);
        A.add(6);
        int B = 6;
        System.out.println("Number of subarrays with XOR " + B + ": " + solve(A, B));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        int xr = 0;

        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(xr, 1);
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            xr = xr ^ A.get(i);

            int x = xr ^ B;

            if (mpp.containsKey(x)) {
                cnt += mpp.get(x);
            }

            if (mpp.containsKey(xr)) {
                mpp.put(xr, mpp.get(xr) + 1);
            } else {
                mpp.put(xr, 1);
            }
        }

        return cnt;
    }
}
