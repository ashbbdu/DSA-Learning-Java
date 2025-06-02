package NewStart.Basics.Maths;

public class CountPrimetillN {

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

    public static int primeUptoN (int n) {
        int cnt = 0;
        for(int i = 1 ; i <= n ; i++) {
            if(isPrimeOptimal(i)) {
                cnt = cnt + 1;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(primeUptoN(20));
    }
}
