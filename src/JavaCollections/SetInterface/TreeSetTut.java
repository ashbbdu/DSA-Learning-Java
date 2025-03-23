package JavaCollections.SetInterface;

import java.util.TreeSet;

public class TreeSetTut {
    public static void main(String[] args) {
        TreeSet <Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        for(var num : ts) {
            System.out.println(num);
        }
        System.out.println();
        System.out.println();
        TreeSet <Integer>  ts1 = new TreeSet<>();
        ts1.add(1);
        ts1.add(5);
        ts1.add(9);
        System.out.println(ts1.floor(4));
        System.out.println(ts1.ceiling(6));

        TreeSet<String> tss = new TreeSet<>();
        tss.add("Shiv");
        tss.add("Ashish");
        tss.add("Priyanka");
        tss.add("Madhur");
        System.out.println(tss);
        System.out.println(tss.floor("Priyanka"));
    }

}
