package AdvanceStart.Arrays;

public class TwoDimensionsArrays {
    public static void main(String[] args) {
        int [][] arr = new int[4][4];
        int count = 1;
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr.length ; j++) {
                arr[i][j] = count++;
            }
            System.out.println();
        }

        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr.length ; j++) {
                System.out.print(arr[i][j] + " ");;
            }
            System.out.println();
        }
    }
}
