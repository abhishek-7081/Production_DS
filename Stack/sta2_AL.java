package Stack;

import java.util.ArrayList;

public class sta2_AL {
    public static class Stack {

        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return list.remove(list.size() - 1);
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = list.get(list.size() - 1);
            return top;
        }
    }

    public static void main(String[] args) {
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        Stack.push(5);
        Stack.push(6);
        Stack.push(7);
        

        System.out.print("Top = ");
        while (!Stack.isEmpty()) {
            System.out.print(Stack.peek() + " --> ");
            Stack.pop();
        }
        System.out.print("= bottom");

    }

}
