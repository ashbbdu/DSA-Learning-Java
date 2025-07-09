package AdvanceStart.BinarySearch.Fundamentals;

public class UpperBound {
    public static int upperBoundBrute (int [] nums , int x) {
        int n = nums.length;
        for(int i = 0 ; i < n ; i++) {
            if(nums[i] > x) {
                return i;
            }
        }
        return n;
    }

    public static int upperBoundOptimal(int[] nums, int x) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        int ans = nums.length;
        while(start <= end) {
            if(nums[mid] > x) {
                end = mid - 1;  // because of logic these values are changed
                ans = mid;
            } else  {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {3,5,8,15,19};
        int x = 9;
        System.out.println(upperBoundBrute(arr,x));
        System.out.println(upperBoundOptimal(arr,x));
    }
}
