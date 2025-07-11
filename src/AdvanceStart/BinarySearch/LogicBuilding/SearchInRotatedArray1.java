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

    public static int searchOptimal(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        int ans = -1;

        while(start <= end) {
            if(nums[mid] == k) {
                ans = mid;
            } else if (nums[mid] < k) {
                start = mid + 1;
            } else {

                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {4, 5, 6, 7, 0, 1, 2};
        int k = 0;
        System.out.println(searchBrute(nums , k));
        System.out.println(searchOptimal(nums , k));
    }
}
