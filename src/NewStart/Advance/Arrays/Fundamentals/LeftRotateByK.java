package NewStart.Advance.Arrays.Fundamentals;

public class LeftRotateByK {
    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k  % n;
        int [] temp = new int[k];
//        Insert into the temp array
        for(int i = 0 ; i < temp.length ; i++) {
            temp[i] = nums[i];
        }

//        move elements to k place forward
        for(int i = 0 ; i < n - k; i++) {
            nums[i] = nums[k+i];
        }

//        push the temp array to last
        for(int i = 0 ; i < temp.length ; i++) {
            nums[n - k + i] = temp[i];
        }
    }



    public static void rotateArrayByRight(int[] nums, int k) {
        int [] temp = new int[k];
//        Insert into the temp array
//        TODO : Implement this
    }

    public static void reverseArray (int [] nums , int start , int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateArrayOptimal(int[] nums, int k) {

        int n = nums.length -1;
        k = k % nums.length;
        reverseArray(nums,0 , k -1);
        reverseArray( nums , k , n);
        reverseArray(nums ,0 , n);
    }
    public static void main(String[] args) {
        int [] nums  = {1, 2, 3, 4, 5 , 6};
        int k = 2;
        int [] nums1 = {3, 4, 1, 5, 3, -5};
        rotateArray(nums , k);
        rotateArrayOptimal(nums1 , 8);

        for(var el : nums) {
            System.out.print(el + " ");
        }
        System.out.println();
        for(var el : nums1) {
            System.out.print(el + " ");
        }

    }
}
