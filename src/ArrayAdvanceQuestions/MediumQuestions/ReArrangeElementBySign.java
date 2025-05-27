package ArrayAdvanceQuestions.MediumQuestions;

import java.util.ArrayList;

public class ReArrangeElementBySign {
    public static int[] rearrangeArrayBrute(int[] nums) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] < 0) {
                negative.add(nums[i]);
            } else {
                positive.add(nums[i]);
            }
        }

        for(int i = 0 ; i < nums.length / 2 ; i++) {
            nums[2 * i] = positive.get(i);
            nums[2 * i + 1] = negative.get(i);
        }

        return nums;

    }
    public static void main(String[] args) {
        int [] arr = {1, -1, -3, -4, 2, 3};
        int [] ans = rearrangeArrayBrute(arr);
        for(var el : ans) {
            System.out.print(el + " ");
        }
    }
}
