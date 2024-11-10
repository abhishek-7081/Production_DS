package Sorting.Insertion_Sort;

import java.sql.Time;

public class is_1 {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = { 23, 11, 7, 8, 9, 5, 1 };
// Time Complexity: O(N2)
        // Insertion Sort
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {

                //keep swapping 
                arr[j + 1] = arr[j];
                j--;
            }

            // placement
            arr[j + 1] = current;
        }
        printArray(arr);
    }

}
