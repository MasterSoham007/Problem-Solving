public class mergeSortedArrays {

    public static void swapIfGreater(long arr1[], long arr2[], int ind1, int ind2){
        if(arr1[ind1] > arr2[ind2]){
            long temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp; 
        }
    }

    public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){
        int m = a.length;
        int n = b.length;

        int len = m + n;

        int gap = (len / 2) + (len % 2);

        while(gap > 0){
            int left = 0;
            int right = gap;
            while(right < len){
                if(left < m && right < m){
                    swapIfGreater(a, a, left, right);
                } else if(left < m && right >= m){
                    swapIfGreater(a, b, left, right - m);
                } else {
                    swapIfGreater(b, b, left - m, right - m);
                }

                left++;
                right++;
            }

            if(gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }
    }
}
