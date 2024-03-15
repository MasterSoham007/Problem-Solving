import java.util.ArrayList;

public class countInversions {

    public static int merge(int arr[], int low, int mid, int high){
        int cnt = 0;
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                cnt += (mid - left +1);
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

        return cnt;
    }

    public static int mergeSort(int arr[], int low, int high){
        int cnt = 0;
        if(low >= high) return cnt;
        int mid = (low + high) / 2;
        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr, mid+1, high);
        cnt += merge(arr, low, mid, high);
        
        return cnt;
    }
    public static int numberOfInversions(int []a, int n) {
        return mergeSort(a, 0, n-1);
    }
}
