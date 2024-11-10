package Recursion;

public class r4_fibonacci {

    // print fibonacci series

    public static void calFib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        calFib(b, c, n - 1);

    }

    public static void printFib(int n) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        calFib(a, b, n - 2);
    }

    public static void main(String[] args) {
        // n=no of terms
        printFib(10);
    }


    
    // sum of fibonacci no

    // public static int fib(int a){
    // if(a<=1){
    // return a;}

    // return fib(a-1)+fib(a-2);
    // }
    // public static void main(String[] args) {
    // System.out.println(fib(3));
    // }
}
