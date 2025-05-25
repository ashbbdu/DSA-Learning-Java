package ArrayAdvanceQuestions;

import java.util.TreeSet;

public class RemoveDuplicatesFromASortedArray {
    public static int removeDuplicatesBrute (int [] nums) {
        TreeSet<Integer> ts = new TreeSet();
        for(int i = 0 ;  i < nums.length ; i++) {
            ts.add(nums[i]);
        }

        return ts.size();
    }
    public static void main(String[] args) {
        int [] arr = {-2, 2, 4, 4, 4, 4, 5, 5};
        System.out.println(removeDuplicatesBrute(arr));
    }
}
