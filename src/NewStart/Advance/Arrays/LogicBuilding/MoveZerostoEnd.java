package NewStart.Advance.Arrays.LogicBuilding;

public class MoveZerostoEnd {
    public static void moveZeroesBrute(int[] nums) {
        int n = nums.length;
        int [] temp = new int[n];
        int count = 0;
        for (int i = 0 ; i < n ; i++) {
            if(nums[i] != 0) {
                temp[count++] = nums[i];
            }
        }
        for(int i = 0 ; i < n ; i++) {
            nums[i] = temp[i];
        }
        for(int i = count ; i < n ; i++) {
            nums[i] = 0;
        }
    }
    public static void moveZeroesOptimal(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0 ; i < n ; i++) {
            if(nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        while(count < n) {
            nums[count++] = 0;
        }


    }
    public static void main(String[] args) {
        int [] arr = {0, 0, 0, 1, 3, -2};
        moveZeroesBrute(arr);
        for(var el : arr) {
            System.out.print(el + " ");
        }

        System.out.println();

        int [] brr = {0, 1, 4, 0, 5, 2};
        moveZeroesOptimal(brr);
        for(var el : brr) {
            System.out.print(el + " ");
        }
    }
}
