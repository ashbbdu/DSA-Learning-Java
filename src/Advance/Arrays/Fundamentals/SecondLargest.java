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


    public static int secondLargestElementBetter(int[] nums) {
        int n = nums.length;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0 ; i < n ; i++) {
            if(largest < nums[i]) {
                largest = nums[i];
            }
        }

        for(int i = 0 ; i < n ; i++) {
            if(secondLargest < nums[i] && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }
//        if second largest is not changed then return -1 handled for [10, 10, 10, 10, 10] this case
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }


    public static int secondLargestElementoptimal(int[] nums) {
        int n = nums.length;
        if(n < 2) return -1;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0 ; i < n ; i++) {
            if(nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if(nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int [] arr = {3,4,5,1,2,6,7,9, 10,10,11};
//        for(var a : arr) {
//            System.out.print(a + " ");
//        }

        System.out.println(secondLargestElementBrute(arr));

        System.out.println(secondLargestElementBetter(arr));


        System.out.println(secondLargestElementoptimal(arr));

    }
}
