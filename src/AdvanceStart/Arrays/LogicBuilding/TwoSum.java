package AdvanceStart.Arrays.LogicBuilding;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSumBrute(int[] nums, int target) {
        int n = nums.length;
        int [] ans = new int[2];
        for(int i = 0 ; i < n ; i++) {
            for(int j = i+1 ; j < n ; j++) { // i+1 and not 0 because we dont want to calculate Same Element Twice
                if(nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }

        }
        // Return {-1, -1} if no such pair is found
        return new int[]{-1, -1};
    }
//    public static int[] twoSumBetter(int[] nums, int target) {
//        needs hashing concepts will come back on this
//    }
public static int[] twoSumOptimal(int[] nums, int target) {
//        This solution will only work if the array is sorted
        int start = 0;
        int [] arr = new int[2];
        int end = nums.length -1;
        while(start < end) {
            if(nums[start] + nums[end] == target) {
                arr[0] = start;
                arr[1] = end;
                return arr;
            }
            if(nums[start] + nums[end] > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[]{-1, -1};
//        return arr;
}

    public static void main(String[] args) {
        int [] arr = {5,4,5,7,1,2};
        int [] ans = twoSumBrute(arr , 10);
        System.out.println(Arrays.toString(ans));
        int [] arr1 = {2,7,11,15};
        int [] ans1 = twoSumOptimal(arr1 , 9);
        System.out.println(Arrays.toString(ans1));

    }
}
