package BasicMaths;

public class Q7 {
    public static int countNum (int n) {
        int count = 0;
        while(n > 0) {
            count = count + 1;
            n = n/10;
        }
        return  count;
    }
    public static boolean isArmstrong (int n) {
        int num = n;
        int sum = 0;
        int count = 0;

        int totalDigits = countNum(num);
        System.out.println(totalDigits);
        while(n > 0) {
            int lastDigit = n % 10;
            sum = sum + (int)Math.pow(lastDigit , totalDigits);
//            sum+= sum + Math.pow(lastDigit , totalDigits);;
            n = n/10;
        }
        return sum == num;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(1634));
        System.out.println(Math.pow(1 , 2));
    }
}
