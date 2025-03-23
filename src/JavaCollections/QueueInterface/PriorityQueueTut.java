package JavaCollections.QueueInterface;

import java.util.PriorityQueue;

public class PriorityQueueTut {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1);
        pq.offer(2);
        pq.offer(-1);
//        System.out.println(pq);
//        System.out.println(pq.peek()); // will return the smallest element
        while (pq.isEmpty() == false) {
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}
