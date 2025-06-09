package NewStart.Basics.Recursion;

public class SumOfDigitOfAGiveNumber {
    public static int add(int num) {
        if(num == 0) {
            return 0;
        }
        int lastDigit = num % 10;
        num = num/10;
        return add(num) + lastDigit;
    }
    public static int addDigits(int num) {
        if (num < 10) return num; // base case: single-digit so this is base case

        int sum = add(num);
        return addDigits(sum); // keep
    }
    public static void main(String[] args) {
        System.out.println(addDigits(2147483647));
    }
}
