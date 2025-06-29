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

    public static int secondLargestElementBetter(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0 ;  i < nums.length ; i++) {
            if(nums[i] > largest) {
                largest = nums[i];
            }
        }
        for (int i = 0 ;  i < nums.length ; i++) {
            if(nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1  : secondLargest;
    }

    public static int secondLargestElementOptimal(int[] nums) {
//        for dry run use this array
//        int [] arr = {1,2,4,7,7};
        int n = nums.length;
        int largest = nums[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0 ; i < n  ; i++) {
            if(nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if(nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1  : secondLargest;
    }
    public static void main(String[] args) {
        int [] arr = {5, 1, 9, 3, 7 , 9,7};
        System.out.println(secondLargestElementBrute(arr));
        System.out.println(secondLargestElementBetter(arr));
        System.out.println(secondLargestElementOptimal(arr));
    }
}
