package JavaCollections.MapInterface;

import java.util.HashMap;

public class HashMapTut {
    public static void main(String[] args) {
        HashMap<Integer , String> hm = new HashMap<>();
        hm.put(3 , "Shiv");
        hm.put(1 , "Ashish");
        hm.put(2 , "Priyanka");
        System.out.println(hm);
        System.out.println(hm.get(1));
        hm.remove(2);
        System.out.println(hm);
    }
}
