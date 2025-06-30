package AdvanceStart.Arrays.Fundamentals;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void moveZeroesBrute(int[] nums) {
        int n = nums.length;
        int count = 0;
        int [] temp = new int[n];
        for(int i = 0 ; i < n ;i++) {
           if(nums[i] != 0) {
               temp[count++] = nums[i];
           }
        }


        for(int i = 0 ;i < n; i++) {
            nums[i] = temp[i];
        }


        for(int i = count ; i < n ; i++) {
            nums[i] = 0;
        }
    }
    public static void main(String[] args) {
        int [] arr = {0, 1, 4, 0, 5, 2};
        moveZeroesBrute(arr);
        System.out.println(Arrays.toString(arr));
    }
}
