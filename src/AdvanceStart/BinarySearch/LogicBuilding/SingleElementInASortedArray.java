package AdvanceStart.BinarySearch.LogicBuilding;

public class SingleElementInASortedArray {
    public static int singleNonDuplicateBrute1(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        for (int i = 0 ; i < n ; i++) {
            if(i == 0) {
                if(nums[i] != nums[i+1]) {
                    return nums[i];
                }
            }
            else if(i == n - 1) {
                if(nums[i] != nums[i -1]) {
                    return nums[i];
                }
            }
            else {
                if(nums[i+1] != nums[i] && nums[i] != nums[i - 1]) {
                    return nums[i];
                }
            }

        }
        return -1;
    }

    public static int singleNonDuplicateBrute2(int[] nums) {
        int ans = 0;
        for(int i = 0 ; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {1, 1, 3, 5, 5};
        System.out.println(singleNonDuplicateBrute1(nums));
        System.out.println(singleNonDuplicateBrute2(nums));
    }
}
