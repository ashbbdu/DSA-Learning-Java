package Patterns;

public class Pattern14 {
    public static void main(String[] args) {
//        char A = 65;
//        System.out.println(A);
        int n = 4;
        for(int row = 0 ; row < n ; row++) {
            for (char ch = 'A'; ch <= 'A' + row; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}
