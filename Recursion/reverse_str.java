package Recursion;

public class reverse_str {
    public static void printrev(String str, int idx) {
        if (idx==0) {
            System.out.println(str.charAt(idx));
            return;
            
        }
        System.out.print(str.charAt(idx));
        printrev(str, idx-1);

    }

    public static void main(String[] args) {
        printrev("Hello", 4);
        printrev("HelloWorld", 9);
    }
}
