package AdvanceStart.BinarySearch.TwoDArrays;

public class FIndRowwithMax1 {
//    public static int rowWithMax1s(int[][] mat) {
//        int count = 0;
//        for(int i = 0; i < mat.length; i++) {
//            int cnt = 0;
//            for(int j = 0; j < mat.length; j++) {
//
//                if(mat[i][j] == 1) {
//                    cnt = cnt + 1;
//                }
//                count = Math.max(count , cnt);
//            }
//          cnt = 0;
//        }
//
//        return count;
//    }

    public static int rowWithMax1s(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int cntComparision = 0;
        int index = -1;
        for(int i = 0; i < n; i++) {
            int onesCount = 0;
            for(int j = 0; j < m; j++) {

//                if(mat[i][j] == 1) {
//                    onesCount = onesCount + 1;
//                }
//                also can be done
            onesCount = onesCount + mat[i][j];
            }
         if(onesCount > cntComparision) {
             cntComparision = onesCount;
             index = i;
         }
        }

        return index    ;
    }
    public static int firstOccurance(int [] nums , int m , int target) {
        int start = 0;
        int end = m - 1;
        int ans = m;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if(nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
    public static int rowWithMax1sOptimal(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int countComp = 0;
        int index = -1;
        for(int i = 0 ; i < n ; i++) {
            int onesCount = m - firstOccurance(mat[i] , m , 1);
            if(onesCount > countComp) {
                countComp = onesCount;
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int [][] arr = {{1, 1, 1} , {0, 0, 1} , {0, 0, 0}};
        System.out.println(rowWithMax1s(arr));
        System.out.println(rowWithMax1sOptimal(arr));
    }
}
