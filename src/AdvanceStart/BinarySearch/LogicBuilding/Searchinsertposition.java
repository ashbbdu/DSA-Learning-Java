package AdvanceStart.BinarySearch.LogicBuilding;

public class Searchinsertposition {
    public static int searchInsertBrute(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i < n ; i++) {
            if(nums[i] >= target) {
                return i;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 6};
        System.out.println(searchInsertBrute(arr , 7));
    }
}
