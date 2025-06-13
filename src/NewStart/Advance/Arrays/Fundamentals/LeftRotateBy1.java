package NewStart.Advance.Arrays.Fundamentals;

public class LeftRotateBy1 {
    public static void main(String[] args) {
        int [] nums  = {1, 2, 3, 4, 5};
        int temp = nums[0];
        for(int i = 0 ; i < nums.length -1 ;i++) {
            nums[i] = nums[i+1];
        }

        nums[nums.length - 1] = temp;

        for(var el : nums) {
            System.out.println(el);
        }
    }
}
