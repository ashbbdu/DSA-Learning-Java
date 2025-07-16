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
            totalTime += (nums[i] + index - 1) / index;

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

    public static int minimumRateToEatBananasOptima(int[] nums, int h) {
        int start = 1;
        int end = findMinimum(nums);

        int ans = 0;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(calculateHourse(nums , mid)  <= h) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

//        return start; or
        return ans;
    }
    public static void main(String[] args) {
//        int [] arr = {7, 15, 6, 3};
//        brute solution will not work for larger inputs
        int [] arr = {805306368,805306368,805306368};
//        int totalTime = 8;
        int totalTime = 1000000000;
//        System.out.println(minimumRateToEatBananasBrute(arr , totalTime));
        System.out.println(minimumRateToEatBananasOptima(arr , totalTime));
    }
}
