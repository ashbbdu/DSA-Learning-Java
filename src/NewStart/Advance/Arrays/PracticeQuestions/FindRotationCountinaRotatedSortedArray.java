package NewStart.Advance.Arrays.PracticeQuestions;

public class FindRotationCountinaRotatedSortedArray {
    public static int findCount (int [] nums , int start , int end) {
        int count = 0;
        while(start < end) {
            if(nums[start] > nums[end]) {
                count = count + 1;
            }
            start++;
            end--;
        }
        return count;
    }
//This is the actual question
//    can also be done using Binary Search
    public static int findIndex (int [] nums) {
//        just find the minimum values index
        int mini = nums[0];
        int index = 0;
        for(int i = 1; i < nums.length ; i++) {
            if(nums[i] < mini) {
                mini = nums[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int [] nums = {3, 4, 5, 1, 2};
        System.out.println(findCount(nums , 0 , nums.length - 1));
        System.out.println(findIndex(nums));
    }
}
