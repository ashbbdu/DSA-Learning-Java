package JavaCollections.QueueInterface;

import java.util.ArrayDeque;

public class ArrayDequeueTut {
    public static void main(String[] args) {
        ArrayDeque<Integer>  ad = new ArrayDeque<>();
        ad.offer(1);
        ad.offer(2);
        ad.offer(3);
        ad.offer(4);
        System.out.println(ad);
        System.out.println(ad.peek()); //will return the element which is added first
        System.out.println(ad.poll()); // will take out the first added element
        System.out.println(ad.peek());
    }
}
