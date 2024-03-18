import java.util.ArrayList;

public class singleElementInSortedArray {
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        int n = arr.size();
        if(n == 1) return arr.get(0);
        if(arr.get(0) != arr.get(1)) return arr.get(0);
        if(arr.get(n-1) != arr.get(n-2)) return arr.get(n-1);

        int low = 1, high = n - 2;

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr.get(mid) != arr.get(mid + 1) && arr.get(mid) != arr.get(mid - 1)) return arr.get(mid);

            if((mid % 2 == 1 && arr.get(mid - 1) == arr.get(mid)) || (mid % 2 == 0 && arr.get(mid + 1) == arr.get(mid))){
                low = mid + 1; // eliminate the left half
            }

            else{
                high = mid - 1; // eliminate the right half
            }
        }

        return -1;
    }
}
