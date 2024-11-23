package LinkedList;

public class ll2_node_insertion_remove {

    Node head;

    private int size;

    // constructor
    ll2_node_insertion_remove() {
        size = 0;
    }

    // making node
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // adding
    public void addFirst(String data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    // printing
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");

    }

    // remove
    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        head = head.next;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondlastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secondlastNode = secondlastNode.next;
            lastNode = lastNode.next;
        }

        secondlastNode.next = null;
    }

    // size

    public int getSize() {
        return size;
    }

    // reversing Linked List using while loop

    public void reverseItrate() {
        if (head == null || head.next == null) {
            return;

        }
        Node prevNode = head;
        Node currentNode = head.next;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;

            // update
            prevNode = currentNode;
            currentNode = nextNode;

        }
        head.next = null;
        head = prevNode;

    }

    // main function calling
    public static void main(String args[]) {
        ll2_node_insertion_remove list = new ll2_node_insertion_remove();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());

        // list.removeFirst();
        // list.printList();

        // list.removeLast();
        // list.printList();
        list.reverseItrate();
        list.printList();
    }

}
