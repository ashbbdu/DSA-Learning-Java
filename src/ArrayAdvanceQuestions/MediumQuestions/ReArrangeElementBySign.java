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


    public static int[] rearrangeArrayOptimal(int[] nums) {
        int n = nums.length;
        int posIndex = 0;
        int negIndex =1;
        int [] newArr = new int[n];
//        dry run and tc and sc in office
        for(int i = 0 ; i < n ; i++) {
            if(nums[i] < 0) {
                newArr[negIndex] = nums[i];

                negIndex = negIndex+2;
            } else  {
                newArr[posIndex] = nums[i];
                posIndex = posIndex + 2;
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int [] arr = {1, -1, -3, -4, 2, 3};
        int [] ans = rearrangeArrayBrute(arr);
        int [] anss = rearrangeArrayOptimal(arr);
        for(var el : ans) {
            System.out.print(el + " ");
        }
        System.out.println();
        for(var el : anss) {
            System.out.print(el + " ");
        }
    }
}
