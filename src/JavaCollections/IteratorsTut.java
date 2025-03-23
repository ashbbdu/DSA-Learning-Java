package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorsTut {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(3);
        al.add(5);
        for(var num : al) {
            System.out.println(num);
        }

//        Iterator
        Iterator<Integer> it = al.iterator();
        while (it.hasNext()) {
            Integer num = it.next();
            System.out.println(num);
        }
    }
}
