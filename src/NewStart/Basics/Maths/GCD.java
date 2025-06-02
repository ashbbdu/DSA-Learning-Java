package NewStart.Basics.Maths;

public class GCD {
    public static int gcdBrute(int n1, int n2) {
        int gcd = 1;
        for(int i = 1 ; i <= Math.min(n1 , n2) ; i++) {
            if(n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int gcdBetter(int n1, int n2) {
        int gcd = 1;
        for(int i = Math.min(n1 , n2) ; i >= 1 ; i--) {
            if(n1 % i == 0 && n2 % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        System.out.println(gcdBrute(9 , 8));
        System.out.println(gcdBetter(4,6));
    }
}
