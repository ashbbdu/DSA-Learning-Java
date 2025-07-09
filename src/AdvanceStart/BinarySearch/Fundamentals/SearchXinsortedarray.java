package AdvanceStart.BinarySearch.Fundamentals;

public class SearchXinsortedarray {
    public static int searchBrute(int[] nums, int target) {
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int searchX(int[] nums, int n , int target) {
        if(n < 0) {
            System.out.println("came");
            return -1;
        }

        if(nums[n] == target) {
            return n;
        }
        return searchX(nums , n - 1 , target);
    }
    public static int searchOptima(int[] nums, int target) {
        return searchX(nums , nums.length - 1 , target);
    }

    public static int searchOptimaBinarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        while(start <= end) {
            if(nums[mid] < target) {
                start = mid+1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] == target) {
                return mid;
            }
            mid = start + (end - start) / 2;
        }
        return -1;
    }

    public static int func (int [] nums , int start , int end , int target) {

        int mid = start + (end - start) / 2;
        int index = 0;
        if(nums[mid] < target) {
            index = func(nums , mid + 1 ,end ,target);
        } else if (nums[mid] > target) {
            index = func(nums , start ,mid - 1 ,target);
        } else if (nums[mid] == target) {
            index = mid;
        }
        return  index;
    }

    public static int searchOptimaBinarySearchRecursive(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        return func(nums , start , end , target);
    }
    public static void main(String[] args) {
        int [] arr = {-1,0,3,5,9,12};
        System.out.println(searchBrute(arr , -1));

        System.out.println(searchOptima(arr , -1));

        System.out.println(searchOptimaBinarySearch(arr , -1));

        System.out.println(searchOptimaBinarySearchRecursive(arr , -1));
    }
}
