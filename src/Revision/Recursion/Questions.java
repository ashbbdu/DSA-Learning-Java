package Revision.Recursion;

public class Questions {

    public static int sumoffirstNNumbers (int n) {
        if(n == 0) {
            return 0;
        }
        return n + sumoffirstNNumbers(n - 1);
    }


    public static long factorial(int n) {
        if(n <= 1) {
            // to handle the zero case also , the case when we have to find the factorial of 0;
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(sumoffirstNNumbers(5));
    }
}
