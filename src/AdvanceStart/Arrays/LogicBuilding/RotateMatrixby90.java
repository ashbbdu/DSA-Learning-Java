package AdvanceStart.Arrays.LogicBuilding;

import java.util.Arrays;

public class RotateMatrixby90 {
    public static void rotateMatrixBrute(int[][] matrix) {
//        for(int i = 0 ; i < matrix.length ; i++) {
//            for(int j = 0 ; j < matrix.length ; j++) {
////                matrix[i][j] = matrix[j][matrix.length - i - 1];
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][matrix.length - (i + 1)];
//               matrix[j][matrix.length - (i + 1)] = temp;
//            }
//        }
        int n = matrix.length;
        int [][] rotated = new int[n][n];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                rotated[j][n - (i+1)] = matrix[i][j];
            }
        }

        for(int i = 0 ; i < rotated.length ; i++) {
            for(int j = 0 ; j < rotated.length ; j++) {
                System.out.print(rotated[i][j] + " ");;
            }
            System.out.println();
        }
    }


    public static void rotateMatrixOptimal(int[][] matrix) {
        int n = matrix.length;
//        transpose a matrix
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < i ; j++) {
//                swap the elements in the matrix
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
//        swap
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int [][] arr = new int[3][3];
        int count = 1;
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr.length ; j++) {
                arr[i][j] = count++;
            }
            System.out.println();
        }
//        rotateMatrixBrute(arr);
//        for(int i = 0 ; i < arr.length ; i++) {
//            for(int j = 0 ; j < arr.length ; j++) {
//                System.out.print(arr[i][j] + " ");;
//            }
//            System.out.println();
//        }
        rotateMatrixOptimal(arr);
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr.length ; j++) {
                System.out.print(arr[i][j] + " ");;
            }
            System.out.println();
        }


    }

}
