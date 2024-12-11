package Arrays;

import java.util.Scanner;

public class _2d_ar_find_x_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];

        // input
        // rows
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] == x) {
                    System.out.println("the no is at " + i + ", " + j);

                }
            }

        }
sc.close();
    //     boolean found = false; // Flag to track if the number is found

    //     for (int i = 0; i < rows; i++) {
    //         for (int j = 0; j < columns; j++) {
    //             if (arr[i][j] == x) {
    //                 System.out.println("The number is at " + i + ", " + j);
    //                 found = true; // Update the flag
    //                 break; // Exit the inner loop
    //             }
    //         }
    //         if (found) {
    //             break; // Exit the outer loop if the number is found
    //         }
    //     }

    //     if (!found) {
    //         System.out.println("The number is not found in the array.");
    //     }

     }

}
