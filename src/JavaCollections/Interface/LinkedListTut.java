package JavaCollections.Interface;

import java.util.LinkedList;

public class LinkedListTut {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.addFirst(3);
        System.out.println(ll);
        System.out.println(ll.remove(0));
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.size() + " size");
    }
}
