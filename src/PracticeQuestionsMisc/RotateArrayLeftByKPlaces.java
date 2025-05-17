package PracticeQuestionsMisc;

public class RotateArrayLeftByKPlaces {
    public static void reverseArr (int [] nums , int start , int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateLeftByKOptimal (int [] nums , int k) {
        int n = nums.length;
        k = k % n;
        reverseArr(nums ,0 , k - 1);
        reverseArr(nums , k , n - 1);
        reverseArr(nums , 0 , n - 1);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8}; // op => 2,3,4,5,6,1

        rotateLeftByKOptimal(arr ,  10);
        for (var el : arr) {
            System.out.print(el + " ");
        }
    }
}
