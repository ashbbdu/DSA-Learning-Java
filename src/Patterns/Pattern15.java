package Patterns;

public class Pattern15 {
    public static void main(String[] args) {
        int n = 4;
        for(int row = 0 ; row < n ; row++) {
            for(char col = 'A' ; col < 'A' + (n - row) ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
