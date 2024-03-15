import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeOverlappingIntervals {
    // public int[][] merge(int[][] intervals) {
    //     int  n = intervals.length;
        
    //     List<List<Integer>> ans = new ArrayList<>();

    //     Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

    //     for(int i = 0; i < n; i++){
    //         if(ans.isEmpty() || intervals[i][0] > ans.get(ans.size() - 1).get(1)){
    //             ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
    //         }

    //         else{
    //             ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size() - 1).get(1), intervals[i][1]));
    //         }
    //     }

    //     int[][] result = new int[ans.size()][2];

    //     for(int i = 0; i < ans.size(); i++){
    //         result[i][0] = ans.get(i).get(0);
    //         result[i][1] = ans.get(i).get(1);
    //     }

    //     return result;
    // }

    public int[][] merge(int[][] intervals){
        int n = intervals.length;

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        int index = 0;

        for(int i = 1; i < n; i++){
            if(intervals[i][0] <= intervals[index][1]){
                intervals[index][1] = Math.max(intervals[index][1], intervals[i][1]);
            }
            else{
                index++;
                intervals[index] = intervals[i];
            }
        }

        int[][] result = new int[index + 1][2];

        for(int i = 0; i<= index; i++){
            result[i][0] = intervals[i][0];
            result[i][1] = intervals[i][1];
        }

        return result;
    }
}
