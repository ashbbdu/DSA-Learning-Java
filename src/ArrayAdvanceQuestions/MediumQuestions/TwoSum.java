package ArrayAdvanceQuestions.MediumQuestions;

public class TwoSum {
    public static int[] twoSumBrute(int[] nums, int target) {
        int [] arr = new int[2];
        for(int i = 0 ; i < nums.length ; i++) {
            for(int j = i+1 ; j < nums.length ; j++) {
                if(nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }

        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {1, 6, 2, 10, 3};
        int [] brr = twoSumBrute(arr , 7);
        for(var el : brr) {
            System.out.println(el);
        }

    }
}
