package NewStart.Basics.Maths;

public class PerfectNumber {
    public static boolean perfectNumber (int n) {
        int count = 0;
        for(int i = 1 ; i <= Math.sqrt(n) ; i++) {
            if(n %  i == 0) {
                count = count + i;
//            n / i != n adding counter part if it in not  n && i != n / i   if it is not n itself
                    if(n / i != n && i != n / i) {
                        count = count + (n / i);
                    }
            }
        }
        System.out.println(count + " count");
        return n == count;
    }
    public static void main(String[] args) {
        System.out.println(perfectNumber(8128));
    }
}
