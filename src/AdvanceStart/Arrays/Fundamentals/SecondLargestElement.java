package AdvanceStart.Arrays.Fundamentals;

import java.util.Arrays;

public class SecondLargestElement {
    public static int secondLargestElementBrute(int[] nums) {
        Arrays.sort(nums);
        int secondLargest = Integer.MIN_VALUE;
        for(int i = nums.length -1 ; i > 0 ; i--) {
            if(nums[i]  > nums[i - 1]) {
                secondLargest = nums[i-1];
                break;
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1  : secondLargest;
    }
    public static void main(String[] args) {
        int [] arr = {2,2,2,2,2,2};
        System.out.println(secondLargestElementBrute(arr));
    }
}
