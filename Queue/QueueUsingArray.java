package Queue;

public class QueueUsingArray {
    // Queue using Array
    static class Queue {
        private int[] arr;
        private int size;
        private int rear;

        Queue(int size) {
            this.size = size;
            this.arr = new int[size];
            this.rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public boolean isFull() {
            return rear == size - 1;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Overflow");
                return;
            }

            arr[++rear] = data;
        }

        // O(n)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int front = arr[0];
            // Shift elements to the left
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Removed: " + q.remove()); // Should print 1
        System.out.println("Peek: " + q.peek());     // Should print 2
        q.add(4);
        q.add(5);
        q.add(6); // Should print "Overflow"
        while (!q.isEmpty()) {
            System.out.println("Removed: " + q.remove());
        }
    }
}
