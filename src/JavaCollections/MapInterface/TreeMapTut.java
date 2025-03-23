package JavaCollections.MapInterface;


import java.util.Set;
import java.util.TreeMap;

public class TreeMapTut {
    public static void main(String[] args) {
        TreeMap<Integer , String> hm = new TreeMap<>();
        hm.put(3 , "Shiv");
        hm.put(1 , "Ashish");
        hm.put(2 , "Priyanka");
        System.out.println(hm);
//        System.out.println(hm.get(1));
//        hm.remove(2);
//        System.out.println(hm);

        Set<Integer> st = hm.keySet();
        System.out.println(st);
    }
}
