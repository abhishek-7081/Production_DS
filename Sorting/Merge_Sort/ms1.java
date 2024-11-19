package Sorting.Merge_Sort;

public class ms1 {
    // divide and conquer
public static void conquer(int arr[], int si, int mid, int ei) {
    int merged[] = new int[ei-si+1];

    // neither completed nor understanded 
    
}
    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);

    }

}
