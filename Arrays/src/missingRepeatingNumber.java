public class missingRepeatingNumber {
    public static int[] findMissingRepeatingNumbers(int a[]){
        long n = a.length;

        long sn = (n * (n+1)) / 2;
        long s2n = (n * (n+1) * ((2 *n)+1)) / 6;

        long s1 = 0, s2 = 0;

        for(int i = 0; i < n; i++){
            s1 += (long)a[i];
            s2 += (long)a[i] * (long)a[i];
        }

        long val1 = s1 - sn;
        long val2 = s2 - s2n;
        val2 = val2 / val1;

        long x = (val1 + val2) / 2;
        long y = val2 - x;

        return new int[]{(int)x,(int)y};
    }
}
