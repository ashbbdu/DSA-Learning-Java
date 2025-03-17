package Patterns;

public class Pattern13 {
    public static void main(String[] args) {
        int n = 4;
        int val = 1 ;
        for(int row = 0 ; row < n ; row++) {

            for(int col = 0 ; col < row + 1 ; col++) {
                System.out.print(val);
                val = val + 1;
            }
            System.out.println();
        }
    }
}
