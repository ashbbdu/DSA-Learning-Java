package ArrayAdvanceQuestions;

import java.util.Arrays;

public class FindTheMissingNumber {
    public static int findMissingNumberBrute (int [] nums) {

        for(int i = 0 ; i <= nums.length ; i++) {
            int flag = 0;
            for (int j = 0 ; j < nums.length; j++) {
                if(nums[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) return i;
        }
        return -1;

    }

    public static int findMissingNumberBetter (int [] nums) {
//        betters solution needs hasing concept so will do that after doing hasing
        return -1;
    }

    public static int findMissingNumberOptimalOne (int [] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int s1 = 0;
        for(int i = 0 ; i < n ; i++) {
            s1 = s1 + nums[i];
        }
        return sum - s1;
    }

    public static int findMissingNumberOptimalTwo (int [] nums) {
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            xor1 = xor1 ^ nums[i];
            xor2 = xor2 ^ (i +1);
        }
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int [] arr = {1, 3, 6, 4, 2, 5};
//        0, 1, 2, 4, 5, 6
        System.out.println( findMissingNumberBrute(arr));
        System.out.println(findMissingNumberOptimalOne(arr));
        System.out.println(findMissingNumberOptimalTwo(arr));
    }
}
