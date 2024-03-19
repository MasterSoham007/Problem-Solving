class Solution {
        public static int findMin(int arr[]){
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            minimum = Math.min(minimum, arr[i]);
        }

        return minimum;
    }

    public static int findMax(int arr[]){
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            maximum = Math.max(maximum, arr[i]);
        }

        return maximum;
    }

    public static boolean possible(int arr[], int mid, int r, int b){
        int cnt = 0, noOfBouquets = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= mid){
                cnt++;
            }
            else{
                noOfBouquets += (cnt / r);
                cnt = 0;
            }
        }

        noOfBouquets += (cnt / r);

        if(noOfBouquets >= b) return true;
        return false;
    }
    
    public int minDays(int[] bloomDay, int m, int k) {
        int low = findMin(bloomDay), high = findMax(bloomDay);
        int ans = -1;

        if(m*k > bloomDay.length) return -1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(possible(bloomDay, mid, k, m) == true){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
    }
}