package NewStart.Basics.Maths;

public class GCD {
    public static int gcdBrute(int n1, int n2) {
        int gcd = 0;
        for(int i = 1 ; i <= Math.max(n1 , n2) ; i++) {
            if(n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        System.out.println(gcdBrute(9 , 8));
    }
}
