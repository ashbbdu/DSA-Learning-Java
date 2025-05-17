package PracticeQuestionsMisc;

public class LeftRotateAnArrayByOne {
    public static int []  rotateLeftByOne (int [] nums) {
        int temp = nums[0];
        for(int i = 0 ; i < nums.length - 1 ; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;
        return nums;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6}; // op => 2,3,4,5,6,1

        int [] res = rotateLeftByOne(arr);
        for (var el : res) {
            System.out.print(el + " ");
        }
    }
}
