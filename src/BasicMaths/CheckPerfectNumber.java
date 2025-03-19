package BasicMaths;

public class CheckPerfectNumber {
    public  static  boolean isPerfect (int n) {
        int num = n;
        int total = 0;
        for(int i = 1; i < n ; i++) {
            if(n % i == 0) {
                total = total + i;
            }
        }
        return num == total;
    }

    public static void main(String[] args) {
        System.out.println(isPerfect(6));
    }
}
