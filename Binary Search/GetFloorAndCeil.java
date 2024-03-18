public class GetFloorAndCeil {

    public static int getFloor(int arr[], int low, int high, int target){
        int ans = -1;

        while(low <= high){
            int mid = (high + low)/ 2;
            if(arr[mid] <= target){
                ans = arr[mid];
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return ans;
    }

    public static int getCeil(int arr[], int low, int high, int target){
        int ans = -1;
        
        while(low <= high){
            int mid = (high + low) / 2;
            if(arr[mid] >= target){
                ans = arr[mid];
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
    }
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int low = 0, high = n - 1;

        return new int[] {getFloor(a, low, high, x), getCeil(a, low, high, x)};
      }
}
