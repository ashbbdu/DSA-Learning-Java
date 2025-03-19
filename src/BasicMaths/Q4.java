package BasicMaths;

public class Q4 {
    public static boolean checkPalindrome (int n) {
        int num = n;
        int revNum = 0;
        while (n > 0) {
            int lastDigit =  n % 10;
            revNum = (revNum * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println(num);
        System.out.println(revNum);
        return num == revNum;

    }
    public static void main(String[] args) {
        System.out.println(checkPalindrome(121));
    }
}
