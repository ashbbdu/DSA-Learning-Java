package NewStart.Basics.Maths;

public class LCMofTwoNumbers {
    public static int gcdOptimal(int n1, int n2) {
        while (n1 != 0 && n2 != 0) {
            if (n1 > n2) {
//                n1 = n1 - n2;
                n1 = n1 % n2;
            } else {
//                n2 = n2 - n1;
                n2 = n2 % n1;
            }
        }

        if (n1 == 0) return n2;
        return n1;
    }
    public static int lcmOptimal (int n1 , int n2) {
        int gcd =  gcdOptimal(n1 , n2);
        int lcm = (n1 * n2) / gcd;
        return lcm;
    }
    public static void main(String[] args) {
        System.out.println(lcmOptimal(6,4));
    }
}
