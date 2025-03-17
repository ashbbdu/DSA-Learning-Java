package Patterns;

public class Pattern16 {
    public static void main(String[] args) {
        int n = 5 ;
        for (int row = 0 ; row < n ; row++) {
            for(char col = 0 ; col < row + 1  ; col++) {
                char val = (char) ('A' + (row));
                System.out.print(val);
            }
            System.out.println();
        }
    }
}
