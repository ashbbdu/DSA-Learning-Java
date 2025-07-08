package AdvanceStart.Arrays.LogicBuilding;

import java.util.Arrays;

//Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
//
//
//
//A subarray is a contiguous non-empty sequence of elements within an array.
//
//
//        Examples:
//Input: nums = [2, 3, 5, -2, 7, -4]
//
//Output: 15
//
//Explanation: The subarray from index 0 to index 4 has the largest sum = 15
public class KadaneAlgorithm {
    public static int maxSubArrayBrute(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n ; i++) {
            for(int j = i; j < n ; j++) {
                int sum = 0;
                for(int k = i; k < j ; k++) {
                    sum = sum + nums[k];
                }
                maxi = Math.max(maxi , sum);
            }

        }
        return maxi;
    }

    public static int maxSubArrayBetter(int[] nums) {
//        with just two loops
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n ; i++) {
            int sum = 0;
            for(int j = 0; j < n ; j++) {
               sum = sum + nums[j];

                maxi = Math.max(maxi , sum);
            }


        }
        return maxi;
    }





    public static void main(String[] args) {
        int [] nums = {2, 3, 5, -2, 7, -4};
        System.out.println(maxSubArrayBrute(nums));
        System.out.println(maxSubArrayBetter(nums));
    }
}
