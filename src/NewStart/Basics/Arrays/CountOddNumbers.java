package NewStart.Basics.Arrays;

public class CountOddNumbers {
    public static int countOddDigit(int n) {
        int count = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            if(lastDigit % 2 != 0) {
                count = count + 1;
            }
            n = n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countOddDigit(3412));
    }
}
