package LinkedList;


//collection framework

import java.util.LinkedList;

public class ll1_basic {

    public static void main(String args[]) {

       //making linked list

        LinkedList<String> list = new LinkedList<String>();
        list.add("is");
        list.add("a");
        
        list.addLast("list");
        list.addFirst("this");
        System.out.println(list);

        list.add(3, "linked");
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.size());
        list.remove(3);

        System.out.println(list);
        list.removeFirst();

        System.out.println(list);
        list.removeLast();

        System.out.println(list);
    }

}
