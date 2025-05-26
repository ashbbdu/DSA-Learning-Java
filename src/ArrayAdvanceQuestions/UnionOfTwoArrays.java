package ArrayAdvanceQuestions;

import java.util.Set;
import java.util.TreeSet;

public class UnionOfTwoArrays {
    public static int[] unionArrayBrute(int[] nums1, int[] nums2) {
        Set<Integer> st = new TreeSet<>();
        for(var el : nums1) {
            st.add(el);
        }
        for(var el : nums2) {
            st.add(el);
        }

//        System.out.println(st);
        int [] arr = new int[st.size()];
        int count =0;
        for(var el : st) {
            arr[count++] = el;
        }

        return arr;
    }
    public static void main(String[] args) {
        int [] nums1 = {1, 2, 3, 4, 5};
        int [] nums2 = {1, 2, 7};
       int [] arr = unionArrayBrute(nums1 , nums2);
        for(var el : arr) {
            System.out.print(el + " ");
        }
    }
}
