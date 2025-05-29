package NewStart.Basics.Maths;

import java.util.Arrays;

public class DivisorsOfANumber {
    public static int countDivisors (int n) {
        int cnt = 0;
        for(int i = 1 ; i <= n ; i++) {
            if(n % i == 0) {
               cnt = cnt + 1;
            }
        }
        return cnt;
    }

    public static int[] divisorsBrute(int n) {
        int cnt = countDivisors(n);
        int [] nums = new int[cnt];
        int count = 0;
        for(int i = 1 ; i <= n ; i++) {
            if(n % i == 0) {
                nums[count++] = i;
            }
        }
        return nums;
    }

    public static int[] divisorsOptimal(int n) {
        int cnt = countDivisors(n);
        int [] nums = new int[cnt];
        int count = 0;
        for(int i = 1 ; i < Math.sqrt(n) ; i++) {
            if(n % i == 0) {
                nums[count++] = i;

                if(i != n/i) {
                    nums[count++] = n/i;
                }
            }
        }
//        Arrays.sort(nums);
        return nums;
    }
    public static void main(String[] args) {
        int [] arr = divisorsOptimal(6);
        for(var el : arr) {
            System.out.print(el + " ");
        }
    }
}
