package Patterns;

public class Pattern18 {
    public static void main(String[] args) {
//        go through this code again
        int n = 4;
        for(int row = 0 ; row < n ; row++ ) {
            for(char ch = (char)(('A'+ n-1)-row); ch <= ('A'+ n-1); ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
