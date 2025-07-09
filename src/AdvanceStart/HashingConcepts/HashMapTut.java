package AdvanceStart.HashingConcepts;

import java.util.HashMap;
import java.util.Map;

public class HashMapTut {
    public static void main(String[] args) {
//        unordered map
        HashMap <String , Integer> map = new HashMap<>();
        map.put("Ashish" , 01);
        map.put("Priyanka" , 02);
        map.put("Madhur" , 03);
        map.put("Shweksha" , 04);
        System.out.println(map);

        map.put("Madhur" , 05);
        System.out.println(map);
        System.out.println(map.containsKey("Ashish"));
        System.out.println(map.get("Ashish"));
        System.out.println(map.get("test"));

        for(Map.Entry<String , Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
