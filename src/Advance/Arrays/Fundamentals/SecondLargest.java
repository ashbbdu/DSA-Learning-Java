package Advance.Arrays.Fundamentals;

import java.util.Arrays;

public class SecondLargest {

    public static int secondLargestElementBrute(int[] nums) {
        // Brute
        Arrays.sort(nums);
        if(nums.length < 2) return -1;
        int largest = nums[nums.length - 1];
        int secondLargest = -1;
        for(int i = nums.length - 2 ; i >= 0 ; i--) {
            if(nums[i] != largest) {
                secondLargest = nums[i];
                break;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int [] arr = {3,4,5,1,2,6};
//        for(var a : arr) {
//            System.out.print(a + " ");
//        }

        System.out.println(secondLargestElementBrute(arr));

    }
}
