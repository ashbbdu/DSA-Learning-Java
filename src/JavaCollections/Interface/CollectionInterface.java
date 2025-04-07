package JavaCollections.Interface;
 import java.util.*;


//Array List
public class CollectionInterface {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);

        l1.add(110);

        l1.add(2 , 50);


        l1.set(1 , 200);
        Collections.sort(l1);

        System.out.println(l1);
        System.out.println(l1.size());
//        System.out.println(l1);
//        for(int i = 0 ; i < 4 ;i++) {
//            System.out.println(l1.get(i));
//        }
//
//        l1.remove(0);
//        System.out.println(l1);
//        System.out.println(l1.getFirst() );
//        System.out.println(l1.contains(20));
//        l1.addFirst(1);
//        System.out.println(l1);



    }
}
