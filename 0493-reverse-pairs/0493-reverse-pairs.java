class Solution {

    public int reversePairs(int[] nums) {
        return mergeSortAndCount(nums, 0, nums.length - 1);
    }

    public static void merge(int arr[], int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

            while(left <= mid){
                temp.add(arr[left]);
                left++;
            }

            while(right <= high){
                temp.add(arr[right]);
                right++;
            }

            for(int i = low; i <= high; i++){
                arr[i] = temp.get(i - low);
            }
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
