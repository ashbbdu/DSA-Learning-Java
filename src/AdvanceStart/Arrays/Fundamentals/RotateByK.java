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

    public static void reverse (int [] nums , int start , int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateArrayOptimal(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums , 0 , k -1);
        reverse(nums , k , n -1);
        reverse(nums , 0 , n -1);
    }
    public static void main(String[] args) {
        int [] arr = {3, 4, 1, 5, 3, -5};
        rotateArrayBrute(arr , 8);
        System.out.println(Arrays.toString(arr));;

        int [] brr = {3, 4, 1, 5, 3, -5};
        rotateArrayOptimal(brr , 8);
        System.out.println(Arrays.toString(brr));;
    }
}

