package NewStart.Basics.Maths;

public class CheckArmstrong {
    public static int countDigits (int n) {
        int count = 0;
        if(n == 0) return 1;
        while (n > 0) {
            count = count+1;
            n = n /10;
        }
        return count;
    }
    public static boolean isArmstrong(int n) {
        int copy = n;
        int count = countDigits(n);
        int sum = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            sum = sum + (int)Math.pow(lastDigit , count);
            n = n/10;
        }
        System.out.println(copy + " " + sum);
        return copy == sum;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(Math.pow(2 , 2));
    }
}
