package Revision.Recursion;

public class Questions {

    public static int sumoffirstNNumbers (int n) {
        if(n == 0) {
            return 0;
        }
        return n + sumoffirstNNumbers(n - 1);
    }

    public static int sum (int [] arr , int left) {
        if(left >= arr.length) {
            return  0;
        }
        return arr[left] + sum(arr , left + 1);
    }

    public static int sumOfArr (int [] arr , int left) {
        return sum(arr , 0);
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
        int [] arr = {1,2,3,4};
        System.out.println(sumOfArr(arr , 0));
    }
}
