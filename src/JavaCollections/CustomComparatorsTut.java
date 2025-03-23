package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomComparatorsTut {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(1);
        al.add(2);
        Collections.sort(al , new Comparator<Integer>(){
            @Override
            public int compare(Integer num1 , Integer num2) {
//                order is wrong
                if(num1 < num2) {
                    return  1;
                } else if(num1 > num2) {
                    return -1;
                }
                return  0;
            }
        });

        System.out.println(al);
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(5);
        al1.add(1);
        al1.add(2);

//         -> this is lambda
        Collections.sort(al1 , (num1 , num2) -> {
            return  num2 - num1;
        });

        System.out.println(al1);


    }
}
