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
    public static void main(String[] args) {
        int [][] arr = {{0, 1, 1} , {0, 1, 1} , {1, 1, 1}};
        System.out.println(rowWithMax1s(arr));
    }
}
