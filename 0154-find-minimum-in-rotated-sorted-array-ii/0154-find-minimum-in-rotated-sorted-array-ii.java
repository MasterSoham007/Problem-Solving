class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;
            
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                ans = Math.min(ans, arr[mid]);
                low = low + 1;
                high = high - 1;
                continue;
            }

            if (arr[low] < arr[high]) {
                ans = Math.min(ans, arr[low]);
                break;
            }

            if (arr[low] <= arr[mid]) {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            }

            else {
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }

        return ans;
    }
}