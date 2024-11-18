package Arrays;

import java.util.Scanner;

// take an array as an input from the user . Search for the given no x and print the index at which it occurs . 
public class ar1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]= new int[size];

        //input
        for(int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }

        int x= sc.nextInt();
        
        //output
        for(int i=0; i<numbers.length; i++){
         if (numbers[i]==x) {
            System.out.println("X found at index : "+i);
         }   
        }

    }
}
