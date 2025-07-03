package AdvanceStart.Arrays.LogicBuilding;

import java.util.Arrays;

public class RearrangeElementsBySign {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int a = 0;
        int b = 0;
        int negCount = 0;
        int posCount = 0;
        int [] pos = new int[n];
        int [] neg = new int[n];
        for(int i = 0 ; i < n ; i++) {
            if(nums[i] > 0 ) {
              pos[a++] = nums[i];
            } else {
                neg[b++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(pos));
        System.out.println(Arrays.toString(neg));

        for(int i = 0 ;i < n ; i++) {
            if(i % 2 == 0) {
                nums[i] = pos[posCount++];
            } else {
                nums[i] = neg[negCount++];
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int [] arr = {1, -1, -3, -4, 2, 3};
        int [] brr = rearrangeArray(arr);
        System.out.println(Arrays.toString(brr));
    }
}
