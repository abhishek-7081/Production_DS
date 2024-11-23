package Stack.Questions;

import java.util.Stack;

public class push_at_bottom {

    public static void pushbottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        } else {
            int top = s.pop();
            pushbottom(data, s);
            s.push(top);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        // System.out.println("Stack: " + s);
        // while (!s.isEmpty()) {
        //     System.out.println(s.peek() + " ");
        //     s.pop();
        //  }

        pushbottom(7, s);
        // System.out.println("Stack: " + s);

         while (!s.isEmpty()) {
            System.out.println(s.peek() + " ");
            s.pop();
         }
    }
}
