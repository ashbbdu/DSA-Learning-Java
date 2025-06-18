package NewStart.Advance.Arrays.LogicBuilding;

import java.util.TreeSet;

class Solution {
    public int removeDuplicatesBrute(int[] nums) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(var el : nums) {
            ts.add(el);
        }
        int count = 0;
        for(var el : ts) {
            nums[count++] = el;
        }
        return ts.size();
    }

    public int removeDuplicatesOptimal(int[] nums) {
       int n = nums.length;
       if(n == 0) {
           return 0;
       }
       int i = 0;
       for(int j = 1 ;  j < n ; j++) {
           if(nums[i] != nums[j]) {
               i++;
               nums[i] = nums[j];
           }
       }
       return i+1;
    }
}


public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr = {0, 0, 3, 3, 5, 6};
        Solution s = new Solution();
        System.out.println(s.removeDuplicatesBrute(arr));

        int [] brr = {0, 0, 3, 3, 5, 6};
        System.out.println(s.removeDuplicatesOptimal(brr));
    }
}
