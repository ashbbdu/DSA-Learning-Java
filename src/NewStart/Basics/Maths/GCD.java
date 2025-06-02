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

    public static int gcdOptimal(int n1, int n2) {
        while (n1 != 0 && n2 != 0) {
            if (n1 > n2) {
//                n1 = n1 - n2;
                n1 = n1 % n2;
            } else {
//                n2 = n2 - n1;
                n2 = n2 % n1;
            }
        }

        if (n1 == 0) return n2;
        return n1;
    }

    public static void main(String[] args) {
        System.out.println(gcdBrute(9 , 8));
        System.out.println(gcdBetter(4,6));
        System.out.println(gcdOptimal(35,10));
    }
}
