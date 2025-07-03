package AdvanceStart.Arrays.LogicBuilding;

import java.util.ArrayList;
import java.util.Arrays;
//Number of positive and negative numbers are equal.
public class RearrangeElementsBySign {
    public static int[] rearrangeArrayExtreameBrute(int[] nums) {
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
//        System.out.println(Arrays.toString(pos));
//        System.out.println(Arrays.toString(neg));

        for(int i = 0 ;i < n ; i++) {
            if(i % 2 == 0) {
                nums[i] = pos[posCount++];
            } else {
                nums[i] = neg[negCount++];
            }
        }
        return nums;
    }

    public static int[] rearrangeArrayBrute(int[] nums)  {
        int n = nums.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) {
            if(nums[i] > 0) {
                pos.add(nums[i]);
            } else {
                neg.add(nums[i]);
            }
        }
        for(int i = 0 ; i < n/2 ; i++) {
            nums[2 * i] = pos.get(i);
            nums[(2* i )+ 1] = neg.get(i);
        }
        return nums;
    }

    public static int[] rearrangeArrayOptimal(int[] nums)  {
        int n = nums.length;
        int posIndex = 0;
        int negIndex = 1;
        int [] leaders = new int[n];
        for(int i = 0 ; i < n ; i++) {
            if(nums[i] > 0) {
               leaders[posIndex] = nums[i];
               posIndex = posIndex + 2;
            } else {
                leaders[negIndex] = nums[i];
                negIndex = negIndex + 2;
            }
        }
        return leaders;
    }


    public static void main(String[] args) {
        int [] arr = {1, -1, -3, -4, 2, 3};
        int [] brr = rearrangeArrayExtreameBrute(arr);
        System.out.println(Arrays.toString(brr));

        int [] crr = {1, -1, -3, -4, 2, 3};
        int [] drr = rearrangeArrayBrute(crr);
        System.out.println(Arrays.toString(drr));

        int [] err = {1, -1, -3, -4, 2, 3};
        int [] frr = rearrangeArrayOptimal(err);
        System.out.println(Arrays.toString(drr));
    }
}
