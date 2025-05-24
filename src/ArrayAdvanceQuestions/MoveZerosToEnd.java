package ArrayAdvanceQuestions;


public class MoveZerosToEnd {

    public static void moveZerostoEndBrute (int [] nums) {
        int n = nums.length;
        int [] temp = new int[n];
        int count = 0;
        for(int i = 0; i < n ; i++) {
            if(nums[i] != 0) {
                temp[count++] = nums[i];
            }
        }

//        copy non zero elements back to the nums array
        for(int i = 0 ; i < count ; i++) {
            nums[i] = temp[i];
        }

//        fill the remaining array with zeros
        for(int i = count ; i < n ; i++) {
            nums[i] = 0;
        }

    }

    public static void main(String[] args) {
        int [] arr = {0, 1, 4, 0, 5, 2};
        moveZerostoEndBrute(arr);
        for(var el : arr) {
            System.out.print(el + " ");
        }
    }
}
