package NewStart.Advance.Arrays.PracticeQuestions;


import java.util.Arrays;

public class ReverseInGroup {
    public static void reverseInGroup(int [] nums , int k) {
        for(int i =0 ; i < nums.length ; i = i + k) {
            int start = i;
            int end = Math.min((k + i) -1 , nums.length - 1);
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        reverseInGroup(nums , 3);
        System.out.println(Arrays.toString(nums));

    }
}
