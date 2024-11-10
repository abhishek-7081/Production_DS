package Selection_Sort;

public class ss_1 {
    
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = { 23, 11, 7, 8, 9, 5, 1 };

        // time complexity O(n^2)
        // Selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            // swapping
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }

        printArray(arr);
    }

}
