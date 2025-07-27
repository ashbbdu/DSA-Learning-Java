package AdvanceStart.BinarySearch.FAQS;

import java.util.Arrays;

public class AggresiveCows {

    public static boolean canWePlace(int[] nums, int dist , int cows) {
        int cowCount = 1;
        int lastCow = nums[0];
        int n = nums.length;
        for(int i = 1; i < n ; i++) {
            if(nums[i] - lastCow >= dist) {
                cowCount++;
                lastCow = nums[i];
            }
            if(cowCount >= cows) return true;
        }

        return false;
    }
    public static int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int min = nums[0];
        int max = nums[n-1];
        int range = max - min;
        for (int i = 1 ; i < range ; i++) {
            if(!canWePlace(nums , i , k)) {
                return i - 1;
            }
        }
        return range;
    }
    public static void main(String[] args) {
        int [] nums =  {5,4,3,2,1,1000000000};
        int k = 2;
        System.out.println(aggressiveCows(nums , k));
    }
}
