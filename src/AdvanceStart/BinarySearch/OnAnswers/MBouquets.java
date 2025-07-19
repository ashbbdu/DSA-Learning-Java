package AdvanceStart.BinarySearch.OnAnswers;

import java.util.Arrays;

public class MBouquets {
    public static boolean possible(int n, int[] nums, int k, int m , int days) {
        int count = 0;
        int numberOfBoq = 0;
        for(int i = 0; i < n ; i++) {
            if(nums[i] <= days) {
                count = count + 1;
            } else {
                numberOfBoq = numberOfBoq + (count / k);
                count = 0;
            }
        }
        numberOfBoq = numberOfBoq + (count / k);
        if(numberOfBoq >= m) return true;
        return false;
    }
    public static int roseGarden(int n, int[] nums, int k, int m) {
        long val = (long) m * k;
        if(val > n) return  -1;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        for(int i = min ; i <= max ; i++) {
           if(possible(n , nums , k , m , i)) {
              return i;
           };
        }
        return -1;
    }

    public static int roseGardenOptimal(int n, int[] nums, int k, int m) {
        long val = (long) m * k;
        if(val > n) return  -1;
        int index = -1;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        int start = min;
        int end = max;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(possible(n , nums , k , m , mid)){
                index = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int [] arr = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 1;
        int n = arr.length;
        System.out.println( roseGarden(n , arr , k , m));
        System.out.println( roseGardenOptimal(n , arr , k , m));
    }
}
