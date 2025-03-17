package Patterns;

public class Pattern11 {
    public static void main(String[] args) {
        int N = 4;
        for(int row = 0 ; row < N ; row++) {
            int start = 0;
            if(row % 2 == 0) start = 1;
            for (int col = 0 ; col < row+1 ; col++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }

    }
}
