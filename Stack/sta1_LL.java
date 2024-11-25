package Stack;

public class sta1_LL {

    // creating a node

    static class Node {
        int data;
        Node next;

        // constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack {

        public static Node head;

        // Since thi is the default constructor for java so either you remove it or
        // place it there is no effect
        // public Stack() {
        // head = null;
        // }

        public static boolean isEmpty() {
            return head == null;
        }

        // push ((puck) just write to know code is working)

        public static void puck(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // pop to remove and also to see

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek to view
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }
    // Main function 
    public static void main(String[] args) {
        Stack.puck(1);
        Stack.puck(2);
        Stack.puck(3);
        Stack.puck(4);
        Stack.puck(5);
        Stack.puck(6);
        Stack.puck(7);

        while (!Stack.isEmpty()) {
            System.out.print(Stack.peek() + " --> ");
            Stack.pop();
        }

    }

}
