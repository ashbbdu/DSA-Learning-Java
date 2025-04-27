package Advance.Arrays.LogicBuilding;

public class MoveZerosToEnd {

    public static void moveZeroesBrute(int[] nums) {
        int n = nums.length;
        int count = 0;
        int nonZeroCount = 0;
        int c = 0;
        int d = 0;
        for(int i = 0 ; i < n ; i++) {
            if(nums[i] == 0) {
                count++;
            } else {
                nonZeroCount++;
            }
        }


        int [] temp = new int[count];
        int [] nonZeroTemp = new int[nonZeroCount];

        for(int i = 0 ; i < nums.length; i++ ) {
            if(nums[i] == 0) {
                temp[c++] = nums[i];
            }
        }


        for(int i = 0 ; i < nums.length; i++ ) {
            if(nums[i] != 0) {
                nonZeroTemp[d++] = nums[i];
            }
        }



        for(int i = 0 ;i < nonZeroTemp.length ; i++) {
            nums[i] = nonZeroTemp[i];
        }

        for(int i = 0 ; i < temp.length ; i++) {
            nums[nonZeroTemp.length + i] = temp[i];
        }
    }

    public static void moveZeroesOptimal(int[] nums) {
        int n = nums.length;
        int j = 0;
        for(int i = 0 ; i < n ; i++) {
            if(nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

//        inserrt 0 ;
//        we can also use while loop here
        for(int i = j ; i < n ; i++) {
            nums[i] = 0;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,0,2,0,5,0,7};
        moveZeroesBrute(arr);
        for (var el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
        int [] brr = {1,0,2,0,5,0,7};
        moveZeroesOptimal(brr);
        for (var el : brr) {
            System.out.print(el + " ");
        }
    }
}
