package AdvanceStart.Arrays.Fundamentals;

import java.util.Arrays;

public class LeftRotaoteBy1 {
    public static void rotateArrayByOne(int[] nums) {
        int n = nums.length;
        System.out.println(n);
        int temp = nums[0];
//        for(int i = 0 ; i < n - 1 ; i++) {
//            nums[i] = nums[i+1];
//        }
//        or

        for(int i = 1 ; i <= n - 1 ; i++) {
            nums[i -1] = nums[i];
        }

        nums[n -1] = temp;
    }
    public static void main(String[] args) {
        int [] arr = {-1, 0, 3, 6};
        rotateArrayByOne(arr);
        System.out.println(Arrays.toString(arr));
    }
}
