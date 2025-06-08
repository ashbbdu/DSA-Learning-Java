package NewStart.Basics.Recursion;

public class SumofArray {
//    public  static int sum = 0;
//    public static int sumOfArr(int [] nums , int n) {
//
//        while (n < 0) {
//            return 0;
//        }
//        sum = sum + nums[n];
//        sumOfArr(nums , n - 1) ;
//        return sum;
//    }
//
//    public static int arraySum(int[] nums) {
//        //your code goes here
//        return sumOfArr(nums , nums.length - 1);
//    }


//    Optimal
public static int sumOfArr(int [] nums , int n) {

    if (n == nums.length ) {
        return 0;
    }
    return sumOfArr(nums , n + 1) + nums[n];
}

    public static int arraySum(int[] nums) {
        //your code goes here
        return sumOfArr(nums , 0);
    }


    public static void main(String[] args) {
        int [] arr = {12, 9, 17};
        System.out.println(arraySum(arr));
    }
}
