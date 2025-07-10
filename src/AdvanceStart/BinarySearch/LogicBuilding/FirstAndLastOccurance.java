package AdvanceStart.BinarySearch.LogicBuilding;

import java.util.Arrays;

public class FirstAndLastOccurance {
    public static int[] searchRangeBrute(int[] nums, int target) {
        int first = -1;
        int last = -1;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] == target) {
                if(first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        return new int[] {first , last};
    }

    public static int lowerBoundOptimal(int[] nums, int x) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        int endIndex = -1;
        while(start <= end) {
            if(nums[mid] == x) {
                endIndex = mid;
                end = mid - 1;

            } else if (nums[mid] < x) {
                start = mid + 1;
            } else  {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return endIndex;
    }

    public static int upperBoundOptimal(int[] nums, int x) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        int lastIndex = nums.length;
        while(start <= end) {
            if(nums[mid] == x) {
                lastIndex = mid;
                start = mid + 1;
            }
            else if(nums[mid] < x) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return lastIndex;
    }

    public static int[] searchRangeOptimal(int[] nums, int target) {
        int first = lowerBoundOptimal(nums , target);
        int last = upperBoundOptimal(nums , target);
        System.out.println(last + " last");
        if(first == -1) return new int[] {-1,-1};


        return new int[] {first,last};

    }
    public static void main(String[] args) {
        int [] nums = {-23,-22,-20,-19,-17,-17,-7,-2,3,3,9,11,14,14,18,18,22};
        int target = 9;
        int [] ans = searchRangeBrute(nums , target);
        System.out.println(Arrays.toString(ans));
        int [] ans1 = searchRangeOptimal(nums , target);
        System.out.println(Arrays.toString(ans1));
    }
}
