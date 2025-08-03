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
    public static void main(String[] args) {
        int [] nums = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        System.out.println(roseGardenBrute(nums.length , nums , k , m));
//        System.out.println(4/3);
    }
}
