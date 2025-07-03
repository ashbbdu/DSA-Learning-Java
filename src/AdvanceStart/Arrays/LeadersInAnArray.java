package AdvanceStart.Arrays;

import java.util.ArrayList;
import java.util.Collections;

//Similar questions
//Count the number of leaders
//
//        Return index of leaders
//
//        Return sum of leaders
public class LeadersInAnArray {
    public static ArrayList<Integer> leadersBrute(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i++) {
            boolean flag = true;
//            at the last condition the i = 5 ; j = 6 so j which is 6 < n this will be false so it will not go inside the if condition so the flag will be true , and the last element will be added to the leaders list.
            for(int j = i+1 ; j < n ; j++) {
                if(nums[i] <= nums[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                list.add(nums[i]);
            }
        }
      return list;
    }

    public static ArrayList<Integer> leadersOptimal(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int max = nums[n-1];
        list.add(max);
        for(int i = n - 2 ; i >= 0 ;i--) {
            if(nums[i] > max) {
                list.add(nums[i]);
                max = nums[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 5, 3, 1, 2};
        System.out.println(leadersBrute(arr));
        System.out.println(leadersOptimal(arr));
    }
}
