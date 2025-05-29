package NewStart.Basics.Maths;

public class CountAllDigits {
    public static int countDigits (int n) {
        int count = 0;
        if(n == 0) return 1;
        while (n > 0) {
            count = count+1;
            n = n /10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countDigits(0));
    }
}
