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
    public static void main(String[] args) {
        int [] arr = {0, 1, 2, 4, 5, 6};
//        0, 1, 2, 4, 5, 6
        System.out.println( findMissingNumberBrute(arr));
    }
}
