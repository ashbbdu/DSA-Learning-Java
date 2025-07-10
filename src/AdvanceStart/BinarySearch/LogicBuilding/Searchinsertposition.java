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

    public static int searchInsertOptimal(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int mid = start + (end - start) / 2;
        int ans = n;
        while (start <= end) {
            if(nums[mid] >= target) {
               ans = mid;
               end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,5,7,8,9,11};
        System.out.println(searchInsertBrute(arr , 10));
        System.out.println(searchInsertOptimal(arr , 10));
    }
}
