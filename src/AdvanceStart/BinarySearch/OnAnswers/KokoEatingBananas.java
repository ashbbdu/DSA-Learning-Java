package AdvanceStart.BinarySearch.OnAnswers;

public class KokoEatingBananas {
    public static int findMinimum(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] > maxi) {
                maxi = nums[i];
            }
        }
        return maxi;
    }

    public static long calculateHourse (int[] nums , int index) {
        long     totalTime = 0;
        for(int i = 0 ;  i < nums.length ; i++) {
            totalTime = totalTime + (int)Math.ceil((double)nums[i] / index);
        }
        return totalTime;
    }
//    burte will work for small test cases but for bigger test cases it will throw TLE
    public static int minimumRateToEatBananasBrute(int[] nums, int h) {
        int maxElem = findMinimum(nums);

        for(int i = 1 ; i <= maxElem ; i++) {
            if(calculateHourse(nums , i) <= h) {
                return i;
            }
        }
        return maxElem;
    }
    public static void main(String[] args) {
        int [] arr = {3, 7, 6, 11};
        int totalTime = 8;
        System.out.println(minimumRateToEatBananasBrute(arr , totalTime));
    }
}
