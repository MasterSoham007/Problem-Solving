class Solution {

    public int reversePairs(int[] nums) {
        return mergeSortAndCount(nums, 0, nums.length - 1);
    }

    public static void merge(int arr[], int low, int mid, int high){
        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid+1;
        int index = 0;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[index] = arr[left];
                left++;
                index++;
            }
            else{
                temp[index] = arr[right];
                right++;
                index++;
            }
        }

            while(left <= mid){
                temp[index] = arr[left];
                left++;
                index++;
            }

            while(right <= high){
                temp[index] = arr[right];
                right++;
                index++;
            }
        
        System.arraycopy(temp, 0, arr, low, temp.length);
    }

    public static int mergeSortAndCount(int arr[], int low, int high){
        int cnt = 0;

        if(low >= high) return cnt;
        int mid = (low + high) / 2;

        cnt = mergeSortAndCount(arr, low, mid) + mergeSortAndCount(arr, mid + 1, high);

        int right = mid + 1;
        
        for(int i = low; i <= mid; i++){
            while(right <= high && (long)arr[i] > 2 * (long)arr[right]){
                right++;
            }
            cnt = cnt + (right - (mid + 1));
        }

        merge(arr, low, mid, high);

        return cnt;
    }
}
