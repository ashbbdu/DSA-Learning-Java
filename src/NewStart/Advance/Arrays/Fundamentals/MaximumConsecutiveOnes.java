package NewStart.Advance.Arrays.Fundamentals;

import java.util.Arrays;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxi = 0;
        for(int i = 0 ; i < nums.length ;i++) {
            if(nums[i] == 1) {
                count++;
                maxi = Math.max(count , maxi);
            } else {
                count = 0;
            }
        }

        return maxi;
    }
}
public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int [] arr = {1, 1, 0, 0, 1, 1, 1, 0};
        Solution cl = new Solution();
        System.out.println(cl.findMaxConsecutiveOnes(arr));
    }
}
