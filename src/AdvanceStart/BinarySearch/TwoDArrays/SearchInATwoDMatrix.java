package AdvanceStart.BinarySearch.TwoDArrays;

public class SearchInATwoDMatrix {
    public static boolean searchMatrix(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length;
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                if(mat[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean searchNumber(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                return true;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    public static boolean searchNumberBetter(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length;
        for(int i = 0 ; i < n ; i++) {
           if(searchNumber(mat[i] , target)) {
               return true;
           }
        }
        return false;
    }
    public static void main(String[] args) {
        int [][] arr = {{1, 2, 3, 4} , {5, 6, 7, 8} , {9, 10, 11, 12}};
        System.out.println(searchMatrix(arr , 8));
        System.out.println(searchNumberBetter(arr , 9));
    }
}
