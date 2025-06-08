package NewStart.Basics.Recursion;

public class FactorialOfaNumber {
    public static long factorial(int n) {
        while(n == 0) {
            return 1;
        }
        return factorial(n - 1) * n;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
