package NewStart.Basics.Maths;

public class LargestDigit {
    public static int largestDigit(int n) {
        int largest = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            if(largest < lastDigit) {
                largest = lastDigit;
            }
            n = n /10;
        }
        return  largest;
    }
    public static void main(String[] args) {
        System.out.println(largestDigit(89457));
    }
}
