// package String;

import java.util.Scanner;
        // ALWAYS REMEMBER : Java Strings are Immutable. 
public class st1 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        String s = sb.nextLine();

        // for length
        System.out.println("The length of string is: "+s.length());

        // for every char print
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

    }
}
