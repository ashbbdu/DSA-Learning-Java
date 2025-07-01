package AdvanceStart.Arrays.LogicBuilding;

public class FindMissingNumber {
    public static int missingNumberBrute(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i <= n ;i++) {
            boolean flag = false;
            for(int j = 0 ; j < n ; j++) {
                if(nums[j] == i) {
                    flag = true; // means i is present in the array
                    break;
                }
            }


            if(!flag) return i;
        }
        return -1;
    }
    public static int missingNumberOptimal1(int[] nums) {
        int n = nums.length;
//         Summation of first N natural numbers
        int sum1 = n*(n+1)/2;
        int sum2 = 0;
        for(var s : nums) {
            sum2 = sum2 + s;
        }

        return  sum1  - sum2;

    }
    public static void main(String[] args) {
        int [] arr = {0, 2, 3, 1, 4};
        System.out.println(missingNumberBrute((arr)));
        System.out.println(missingNumberOptimal1(arr));
    }
}
