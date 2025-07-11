package AdvanceStart.BinarySearch.LogicBuilding;

public class SearchInRotatedArray1 {
    public static int searchBrute(int[] nums, int k) {
        for(int i = 0 ; i < nums.length ; i++) {
            if (nums[i] == k) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums = {4, 5, 6, 7, 0, 1, 2};
        int k = 5;
        System.out.println(searchBrute(nums , k));
    }
}
