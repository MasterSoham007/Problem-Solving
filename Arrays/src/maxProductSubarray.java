public class maxProductSubarray {
    public static int subarrayWithMaxProduct(int arr[]) {
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;

        int pre = 1, suff = 1;

        for (int i = 0; i < n; i++) {
            pre = pre * arr[i];
            suff = suff * arr[n - i - 1];

            maxi = Math.max(maxi, Math.max(pre, suff));

            if (pre == 0)
                pre = 1;
            if (suff == 0)
                suff = 1;
        }

        return maxi;
    }
}
