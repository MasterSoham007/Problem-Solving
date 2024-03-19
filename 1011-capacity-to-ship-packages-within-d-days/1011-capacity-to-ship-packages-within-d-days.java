class Solution {
    
    public static int findMax(int arr[]){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            maxi = Math.max(maxi, arr[i]);
        }

        return maxi;
    }

    public static int noOfDays(int arr[], int mid){
        int days = 1, load = 0;

        for(int i = 0; i < arr.length; i++){
            if(load + arr[i] > mid){
                days = days + 1;
                load = arr[i];
            }
            else{
                load += arr[i];
            }
        }

        return days;
    }
    
    public int shipWithinDays(int[] weights, int days) {
        int low = findMax(weights), high = Arrays.stream(weights).sum();

        while(low <= high){
            int mid = (low + high) / 2;
            
            if(noOfDays(weights, mid) <= days){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }
}