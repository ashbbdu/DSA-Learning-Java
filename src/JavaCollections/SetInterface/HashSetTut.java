package JavaCollections.SetInterface;

import java.util.HashSet;

public class HashSetTut {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(1);
        hs.add(0);
        System.out.println(hs.contains(2));
        System.out.println(hs);

//       iterate
        for(Integer num : hs) {
            System.out.println(num);
        }

//        instead of using Integer or any other datatype use var , var automatically identifies the data structures
        for(var num : hs) {
            System.out.println(num);
        }
    }
}
