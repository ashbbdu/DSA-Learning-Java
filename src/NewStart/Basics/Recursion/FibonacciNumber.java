package NewStart.Basics.Recursion;

public class FibonacciNumber {
    public static int fib(int n) {
        //your code goes here
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
