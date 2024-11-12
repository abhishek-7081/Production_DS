// Sum of n natural no

//i starting no 
//n ending no 
package Recursion;

public class r2 {
    public static void printSum(int i, int n, int sum) {
        // n+1 means run to the last no like upto 10
        if (i == n) {
            sum = sum + i;//if not wwant to apply it just write if(i == n+ 1) so that until last no we can add
            System.out.print(sum + " ");
            return;
        }
        sum = sum + i;

        printSum(i + 1, n, sum);

    }

    public static void main(String[] args) {
        printSum(0, 10, 0);
    }

}
