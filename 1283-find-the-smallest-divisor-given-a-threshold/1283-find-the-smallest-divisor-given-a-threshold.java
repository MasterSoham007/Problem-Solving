class Solution {
    public static int findMax(int arr[]){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
    }

    public static boolean findIfPossible(int arr[], int mid, int limit){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += Math.ceil((double)arr[i] / (double)mid);
        }

        if(sum <= limit) return true;

        return false;
    }
    
    public static int smallestDivisor(int arr[], int limit) {
        int low = 1, high = findMax(arr);
        int ans = high;

        while(low <= high){
            int mid = (low + high) / 2;
            if(findIfPossible(arr, mid, limit) == true){
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