package String;

import java.io.StreamCorruptedException;
import java.util.Scanner;

public class st2_compare {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the first string");
        String a = ab.nextLine();
        System.out.println("Enter the second string");
        String b = ab.nextLine();

        // if (a==b) {
        // if (a.equals(b)) {
        // System.out.println("Both strings are equal");
        // } else {
        // System.out.println("Both strings are not equal");
        // }

        // this condition fails here beacuse strings are saved in memory in form of object

        // if (new String(a) == (new String(b))) {
        //     System.out.println("Both strings are equal");
        // } else {
        //     System.out.println("Both strings are not equal");
        // }
        // here its fails
        // reason will know in string builders




        // instead of all this use 
// it gives 0 on same 
// otherwise in else conditon 
if (a.compareTo(b)==0) {
    System.out.println("Both strings are equal");
} else {
    System.out.println("Both strings are NOT equal");
}

    }
}
