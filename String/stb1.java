// package String;

public class stb1 {
    public static void main(String[] args) {

        // Time compexity O(n)

        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println("String = " + sb);

        // Reversing the StringBuilder
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            // Swap characters
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println("REversed String = " + sb);
    }

}
