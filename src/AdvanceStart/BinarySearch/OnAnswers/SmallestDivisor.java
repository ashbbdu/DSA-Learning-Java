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

    public static int smallestDivisorOptimal(int[] nums, int threshold) {
        int start = 1;
        int end = findMax(nums);
        int ans = -1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(checkThreshold(nums , mid) <= threshold) {
                ans = mid;
                end = mid - 1;
            } else  {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {8,4,2,3};
        int t = 10;
        System.out.println(smallestDivisor(nums , t));
        System.out.println(smallestDivisorOptimal(nums , t));
    }
}
