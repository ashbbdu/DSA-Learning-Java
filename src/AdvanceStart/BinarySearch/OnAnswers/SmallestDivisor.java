package AdvanceStart.BinarySearch.OnAnswers;

public class SmallestDivisor {
    public static int findMax (int [] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++) {
            max = Math.max(max , nums[i]);
        }
        return max;
    }
    public static int checkThreshold(int[] nums, int index) {
        int sum = 0;
        for(int i = 0 ;  i < nums.length ; i++) {
            sum += (int) Math.ceil((double) nums[i] / index);
        }
        return (int)sum;
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = findMax(nums);
        for(int i = start ; i <= end ; i++) {
            if(checkThreshold(nums , i) <= threshold) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,5,9};
        int t = 6;
        System.out.println(smallestDivisor(nums , t));
    }
}
