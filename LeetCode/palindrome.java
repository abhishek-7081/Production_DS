import java.util.Scanner;

public class palindrome {

    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int remainder = x % 10;
            reversed = reversed * 10 + remainder;
            x = x / 10;
        }
        return reversed;

    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false; // Negative numbers are not palindromes
        }
        return x == reverse(x);
       

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = scanner.nextInt();
        palindrome obj = new palindrome();
        
        if (obj.isPalindrome(x)) {
            System.out.println("It is palindroem ");

        } else {
            System.out.println("It is not palindroem");
        }
        scanner.close();
    }
    

}

