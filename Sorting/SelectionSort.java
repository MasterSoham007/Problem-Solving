package Sorting;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        int n = arr.length;

        for(int i = 0; i <= n-2; i++){
            int mini = i;
            for(int j = i+1; j <= n-1; j++){
                if(arr[j] < arr[mini]){
                    mini = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
    }
}
