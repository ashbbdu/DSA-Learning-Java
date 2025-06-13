package NewStart.Advance.Arrays.Fundamentals;

public class LeftRotateByK {
    public static void rotateArray(int[] nums, int k) {
        k = k  % nums.length;
        int [] temp = new int[k];
//        Insert into the temp array
        for(int i = 0 ; i < temp.length ; i++) {
            temp[i] = nums[i];
        }

//        move elements to k place forward
        for(int i = 0 ; i < nums.length - k; i++) {
            nums[i] = nums[k+i];
        }

//        push the temp array to last
        for(int i = 0 ; i < temp.length ; i++) {
            nums[nums.length - k + i] = temp[i];
        }
    }

    public static void reverseArray (int [] nums , int start , int end) {

    }

    public static void rotateArrayByRight(int[] nums, int k) {
        int [] temp = new int[k];
//        Insert into the temp array
//        TODO : Implement this
    }

    public static void rotateArrayOptimal(int[] nums, int k) {
        k = k  % nums.length;

    }
    public static void main(String[] args) {
        int [] nums  = {1, 2, 3, 4, 5 , 6};
        int k = 2;

        rotateArray(nums , k);

        for(var el : nums) {
            System.out.println(el);
        }
    }
}
