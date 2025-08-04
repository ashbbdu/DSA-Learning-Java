package AdvanceStart.BinarySearch.OnAnswers;

public class MBouquets {
    public static int calculateBouquets(int[] nums, int k, int day) {
        int n = nums.length;
        int totalBouquet = 0;
        int countBouquet = 0;
        for(int i = 0 ; i < n ; i++) {
            if(nums[i] <= day) {
                countBouquet++;
            } else {
                totalBouquet = totalBouquet + (countBouquet / k);
                countBouquet = 0;
            }
        }
        totalBouquet = totalBouquet + (countBouquet / k);
        return totalBouquet;
    }
    public static int roseGardenBrute(int n, int[] nums, int k, int m) {

        long val = (long) m * k;
        if (val > n) return -1;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        for(int i = min ; i <= max ; i++) {
            if(calculateBouquets(nums , k , i) >= m) {
                return i;
            }
        }
        return -1;
    }


    public static int roseGardenOptimal(int n, int[] nums, int k, int m) {

        long val = (long) m * k;
        if (val > n) return -1;
        int start = Integer.MAX_VALUE, end = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            start = Math.min(start, nums[i]);
            end = Math.max(end, nums[i]);
        }
       int ans = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(calculateBouquets(nums , k , mid) >= m) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {1, 10, 3, 10, 2};
        int k = 1;
        int m = 3;
        System.out.println(roseGardenBrute(nums.length , nums , k , m));
        System.out.println(roseGardenOptimal(nums.length , nums , k , m));
//        System.out.println(4/3);
    }
}
