package Patterns;

public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0 ; row < n ; row++) {
//            initial Printing of the value
            for(int col = 0 ; col < row + 1 ; col++) {
                System.out.print(col + 1);
            }

//            for printing spaces
            for(int col = 0 ; col < 2*n - 2* (row + 1) ; col++) {
                System.out.print(" ");
            }

            for (int col = row+1; col > 0; col--) {
                System.out.print(col);
            }


            System.out.println();
        }
    }




}

//package Patterns;
//
//public class Pattern12 {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int row = 0; row < n; row++) {
//            // Print the increasing numbers (left part)
//            for (int col = 0; col < row + 1; col++) {
//                System.out.print(col + 1);
//            }
//
//            // Print the spaces in the middle
//            for (int col = 0; col < 2*n - 2*(row + 1); col++) {
//                System.out.print(" ");
//            }
//
//            // Print the decreasing numbers (right part)
//            for (int col = row + 1; col >= 1; col--) {
//                System.out.print(col);
//            }
//
//            System.out.println();
//        }
//    }
//}
//
