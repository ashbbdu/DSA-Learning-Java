package BasicMaths;

public class Q2 {
    public static int ash (int n) {
        int count = 0;
        while(n > 0) {
            int rem = n % 10;
            if(rem % 2 != 0) {
                count = count + 1;
            }
            n = n / 10;

        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(ash(255));;
        System.out.println(1213 == 1213);
    }
}
