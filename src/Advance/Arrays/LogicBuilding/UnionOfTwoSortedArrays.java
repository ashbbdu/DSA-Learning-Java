package Advance.Arrays.LogicBuilding;

import java.util.*;

public class UnionOfTwoSortedArrays {
    public static int[] unionArray(int[] nums1, int[] nums2) {
        Set<Integer> st = new TreeSet<>();
        for(var el : nums1) {
            st.add(el);
        }
        for(var el : nums2) {
            st.add(el);
        }

        int [] union = new int[st.size()];
        int j = 0;


        Iterator<Integer> it = st.iterator();


//        for(var num : st) {
//            union[j++] = num;
//        }
        for(int i = 0 ; i < st.size() ; i++) {
            union[j++] = it.next();
        }

        return union;
    }
    public static void main(String[] args) {
        int [] nums1 = {1, 2, 3, 4, 5};
        int [] nums2 = {1, 2, 7};
        int [] union = unionArray(nums1 , nums2);
        for(var num : union) {
            System.out.print(num + " ");
        }
        System.out.println();
        List<Integer> li = new ArrayList<>();
        for(var a : union) {
            li.add(a);
        }

        System.out.println(li);

        Iterator<Integer> it = li.iterator();

      for(int i = 0 ; i< li.size() ; i++) {
          System.out.print(it.next() + " ");
      }

    }


}
