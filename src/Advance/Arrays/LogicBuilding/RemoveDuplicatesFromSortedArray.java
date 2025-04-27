package Advance.Arrays.LogicBuilding;

import java.util.HashSet;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
//        HashSet<Integer> s = new HashSet<>(); // it is storing in sorted order
        TreeSet<Integer> s = new TreeSet    <>();
        for(int i = 0 ; i < nums.length ; i++) {
            s.add(nums[i]);
        }

        System.out.println(s);
        return 0;
    }
    public static void main(String[] args) {
        int [] arr = {-30, -30, 0, 0, 10, 20, 30, 30};
        removeDuplicates(arr);
    }
}
