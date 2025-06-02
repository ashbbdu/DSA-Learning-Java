package NewStart.Basics.Maths;

public class CheckPrime {
    public static boolean isPrimeBrute(int n) {
        if(n < 2) return false;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrimeOptimal(int n) {
        if(n < 2) return false;
//        since the loop is iterating till Math.sqrt(n) so we have to also include i <= Math.sqrt(n)
        for(int i = 2 ; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrimeOptimal(4));
        System.out.println(isPrimeBrute(4));
    }
}
