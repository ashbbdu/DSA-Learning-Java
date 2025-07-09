package AdvanceStart.BinarySearch.Fundamentals;

public class LowerBond {
    public static int lowerBoundBrute(int[] nums, int x) {
        int n = nums.length;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] >= x) {
                return i;
            }
        }
        return n;
    }
    public static int lowerBoundOptimal(int[] nums, int x) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        int startIndex = nums.length;
        while(start <= end) {
            if(nums[mid] >= x) {
                end = mid - 1;
                startIndex = mid;
            } else if (nums[mid] < x) {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return startIndex;
    }
    public static void main(String[] args) {
        int [] arr = {3,5,8,15,19};
        int x = 9;
        System.out.println(lowerBoundBrute(arr,x));
        System.out.println(lowerBoundOptimal(arr,x));
    }
}
