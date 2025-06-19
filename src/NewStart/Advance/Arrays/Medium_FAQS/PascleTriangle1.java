package NewStart.Advance.Arrays.Medium_FAQS;

public class PascleTriangle1 {

//    public static int factorial(int n) {
//        if (n == 1) {
//           return 1;
//        }
//        return factorial(n - 1) * n;
//    }
//
//    public static int pascalTriangleIExtreameBrute(int r, int c) {
////        this will fail for large values , because it is not handling long long
//        int row = r - 1;
//        int col = c - 1;
//        int ans = factorial(row)/(factorial(col) * factorial(row - col));
//        return ans;
//    }


    public static int pascalTriangleI(int r, int c) {
        long res = 1; //because i have to return
        if(c > r) c = r;
        for(int i = 0 ; i < c ; i++) {
            res = res * (r - i);
            res = res/(i+1);

        }
        return (int)res;
    }
    public static void main(String[] args) {
        int row = 4;
        int col = 2;
//        System.out.println(pascalTriangleIExtreameBrute(row , col));

        System.out.println(pascalTriangleI(row -1, col-1 ));
    }
}
