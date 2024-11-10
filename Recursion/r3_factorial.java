package Recursion;

public class r3_factorial {
  
    public static int  fact(int n) {
        if (n==0){
            return 1;
        }
        return n * fact(n - 1);
        
    }
    public static void main(String[] args) {
       int sc= fact(3);
       int sc1= fact(5);
       int sc2= fact(9);
       System.out.println(sc+" "+sc1+" "+sc2);
    }
}
