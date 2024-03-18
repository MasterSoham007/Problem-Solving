import java.util.ArrayList;

public class SearchElementsInRotatedArray {
        public static int search(ArrayList<Integer> arr, int n, int k) {
            int low = 0, high = n - 1;

            while(low <= high){
                int mid = (low + high) / 2;

                if(arr.get(mid) == k) return mid;

                // left sorted
                if(arr.get(low) <= arr.get(mid)){
                    if(arr.get(low) <= k && k <= arr.get(mid)){
                        high = mid - 1;
                    }
                    else{
                        low = mid +1;
                    }
                }

                // right sorted
                if(arr.get(high) >= arr.get(mid)){
                    if(arr.get(high) >= k && k >= arr.get(mid)){
                        low = mid + 1;
                    }
                    else{
                        high = mid - 1;
                    }
                }
            }
            return -1;
    }
}
