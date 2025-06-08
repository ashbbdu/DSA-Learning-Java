package NewStart.Basics.Recursion;

public class SumOfFirstNNumbers {
    public static int NnumbersSum(int N) {
        if(N == 0) {
            return 0;
        }
        return NnumbersSum(N - 1) + N;
    }
    public static void main(String[] args) {
        System.out.println(NnumbersSum(4));
    }
}
