package NewStart.Basics.Recursion;

public class ReverseAnArray {
    public static int [] reverse (int [] nums , int start , int end) {
        if (start >= end) {
            return nums;
        }
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        return reverse(nums , start+1 , end-1);
    }
    public static int[] reverseArray(int[] nums) {
        //your code goes here
        int start = 0;
        int end = nums.length - 1;
        return reverse(nums , start , end);
    }
    public static void main(String[] args) {
        int [] arr = {1, 3, 3, 3, 5};
       int [] crr = reverseArray(arr);
       for(var el : crr) {
           System.out.print(el + " ");
       }
    }
}
