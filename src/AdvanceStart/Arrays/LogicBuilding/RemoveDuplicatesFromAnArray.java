package AdvanceStart.Arrays.LogicBuilding;

import java.util.Arrays;
import java.util.TreeSet;

public class RemoveDuplicatesFromAnArray {
    public static int removeDuplicatesBrute(int[] nums) {
        int n = nums.length;
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i =0 ; i < n ; i++) {
            ts.add(nums[i]);
        }
        int [] arr = new int[ts.size()];
        int count = 0;

        for(var el : ts) {
            arr[count++] = el;
        }

        return ts.size();
    }

    public static int removeDuplicatesBrute(int[] nums) {}
    public static void main(String[] args) {
        int [] arr = {0, 0, 3, 3, 5, 6};
        System.out.println(removeDuplicatesBrute(arr));
    }
}
