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

    public static int aggressiveCowsOptimal(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int min = nums[0];
        int max = nums[n-1];
        int start = 0;
        int end = max - min;
        int ans = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(canWePlace(nums , mid , k)) {
                ans = mid;
                start = mid +1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums =  {0, 3, 4, 7, 10, 9};
        int k = 3;
        System.out.println(aggressiveCows(nums , k));
        System.out.println(aggressiveCowsOptimal(nums , k));
    }
}
