package Patterns;

public class Pattern21 {
    public static void main(String[] args) {
        int n =5;
        for(int row = 0 ; row < n ; row++) {
            if (row == 0 || row == n -1) {
                for(int col = 0 ; col < n ; col++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for(int col = 1 ; col < n - 1  ; col++) {
                    System.out.print(" ");
                }
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
