package Recursion;

public class r1 {

    // printing 10 to 1 and 10 to 20
    
    public static void intnodec(int no) {
        // Base condition
        if (no == 0) {
            return;
        }
        System.out.println(no);
        intnodec(no - 1);

    }

    public static void intnoasc(int no) {
        // Base condition
        if (no == 21) {
            return;
        }
        System.out.println(no);
        intnoasc(no + 1);

    }

    public static void main(String[] args) {
        intnodec(10);
        System.out.println("now");
        intnoasc(10);
    }
}
