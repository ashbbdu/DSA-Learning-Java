package AdvanceStart.Arrays.Fundamentals;

import java.util.Arrays;

public class RotateByK {
    public static void rotateArrayBrute(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int [] temp = new int[k];
        for(int i = 0 ; i < k ; i++) {
            temp[i] = nums[i];
        }

        for(int i = 0 ; i <  n - k ;i++) {
            nums[i] = nums[k+i];
        }

        for(int i = n -k ;  i < n ; i++) {
            nums[i] = temp[i+k-n];
        }
    }
    public static void main(String[] args) {
        int [] arr = {3, 4, 1, 5, 3, -5};
        rotateArrayBrute(arr , 8);
        System.out.println(Arrays.toString(arr));;
    }
}

