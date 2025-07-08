package AdvanceStart.Arrays.LogicBuilding;

import java.util.Arrays;

public class SortArrayOn0s1s2s {
    public static void sortZeroOneTwoBetter(int[] nums) {
        int n = nums.length;
    int zeroCount = 0;
    int oneCount = 0;
    int twoCount = 0;
    for(int i = 0 ; i < n ; i++) {
        if(nums[i] == 0) {
            zeroCount++;
        } else if (nums[i] == 1) {
            oneCount++;
        } else {
            twoCount++;
        }
    }

    for(int i = 0 ; i < zeroCount ; i++) {
        nums[i] = 0;
    }

        for(int i = zeroCount ; i < zeroCount + oneCount ; i++) {
            nums[i] = 1;
        }
        for(int i = zeroCount + oneCount ; i < n ; i++) {
            nums[i] = 2;
        }
}

    public static void sortZeroOneTwoOptimal(int[] nums) {
        int n = nums.length;
        int mid = 0;
        int low = 0;
        int high = n-1;
        while(mid <= high) {
            if(nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }  else if(nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {0, 0, 1, 1, 1};
        int [] brr = {1, 0, 2, 1, 0};
        sortZeroOneTwoBetter(arr);
        System.out.println(Arrays.toString(arr));

        sortZeroOneTwoOptimal(brr);
        System.out.println(Arrays.toString(brr));
    }
}
