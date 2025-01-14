package Arrays;

import java.util.Scanner;

public class _2d_array_add_multi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] arr1 = new int[rows][columns];
        System.out.println("enter 1st matrics");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        int[][] arr2 = new int[rows][columns];
        System.out.println("enter 2st matrics");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        //addition
        int[][] arra = new int[rows][columns];
        System.out.println("the sum is");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arra[i][j] =arr1[i][j]+arr2[i][j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arra[i][j] + " ");
            }
            System.out.println();
        }





        //multiplication
        int[][] arr = new int[rows][columns];
        System.out.println("the multipltication result is ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // arr[i][j] = arr1[i][j]*arr2[i][j]; wrong
                arr[i][j] = 0; // Initialize the sum
                for (int k = 0; k < columns; k++) {
                    arr[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}