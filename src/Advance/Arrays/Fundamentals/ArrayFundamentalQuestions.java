package Advance.Arrays.Fundamentals;

public class ArrayFundamentalQuestions {
    public static int largestElement (int [] nums) {
        int largestElement = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++) {
            if(largestElement < nums[i]) {
                largestElement = nums[i];
            }
        }
        return largestElement;
    }
    public static void main(String[] args) {
        int arr [] = {2,5,6,9,7};
        System.out.println(largestElement(arr));
    }
}
