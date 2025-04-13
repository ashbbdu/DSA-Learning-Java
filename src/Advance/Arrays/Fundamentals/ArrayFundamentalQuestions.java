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

    public static int largestElement (int [] nums , int target) {
        for(int i = 0 ; i < nums.length  ; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
//        if element not found
        return -1;
    }
    public static void main(String[] args) {
        int arr [] = {2,5,6,9,7};
        System.out. println(largestElement(arr));
        System.out.println(largestElement(arr , 6));;
    }
}
