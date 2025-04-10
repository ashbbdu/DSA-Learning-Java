package BasicMaths;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Questions {
    public static int countdigitsofanumber (int num) {
        if(num == 0) return 1;
        int count = 0;
        while (num > 0) {
            count = count+1;
            num = num/10;
        }
        return count;
    }

    public static int countOddDigit (int num) {
        int oddCount = 0;
        if(num == 0) return 1;
        while (num > 0) {
            int rem = num % 10;
            if(rem % 2 != 0) {
                oddCount = oddCount + 1;
            }
            num = num /10;
        }
        return oddCount;
    }

    public static int reverseNumber (int num) {
        int rev = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num = num / 10;
        }
        return  rev;
    }

    public static  boolean palindromeCheck (int num) {
        int ref = num;
        int rev = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num = num / 10;
        }
        return  ref == rev;
    }

    public static int largestDigit (int num) {
        int largestDigit = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            if(largestDigit < lastDigit) {
                largestDigit = lastDigit;
            }
            num = num / 10;
        }
        return largestDigit;
    }

    public static int factorial (int num) {
        int factorial = 1;
        for(int i = 1 ; i <= num ; i++) {
            factorial = factorial * i;
        }
        return  factorial;
    }

    public static boolean checkArmstrong (int num) {
        int totalDigits = countdigitsofanumber(num);
        int ref = num;
        int totalCount = 0;
        while(num > 0) {
            int lastDigit = num % 10;
            totalCount = totalCount + (int) Math.pow(lastDigit , totalDigits);
            num = num /10;
        }
        return  ref == totalCount;
    }

    public static boolean isPerfect (int num) {
        int ref = num;
        int val = 0;
        for (int i =1 ; i <= num/2  ; i++) {
            if(num % i == 0) {
                val = val + i;
            }
        }
        return ref == val;
    }

    public static boolean isPrime (int num) {
        int val = 0;
        if(num == 1) return false;
        for (int i =1 ; i <= num/2  ; i++) {
            if(num % i == 0) {
                val = val + i;
            }
        }
        return val <= 2;
    }

    public static int gretestCommonDivisorBrute (int n1 , int n2) {
//        TC => O(Min(n1 , n2))
//        SC => O(1)
        int largest = 1;
        for(int i = 2 ;  i <= Math.min(n1 , n2); i++) {
            if(n1 % i == 0 && n2 % i == 0) {
                largest = i;
            }
        }
        return largest;
    }

    public static int gretestCommonDivisorBetter (int n1 , int n2) {
        int gcd = 1;
        for (int i = Math.min(n1 , n2) ; i >= 2; i--) {
            if(n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }
        return gcd;
    }


    public static int gretestCommonDivisorOptimal (int n1 , int n2) {
//        Time Complexity: O(log(min(N1, N2))) – where N1 and N2 are given numbers. Because in every iteration, the algorithm is dividing larger number with the smaller number resulting in time complexity.(approx.)

//                Space Complexity: O(1) – Using a couple of variables i.e., constant space.
        while (n1 != 0 && n2 != 0) {
            if(n1 > n2) {
//                n1 = n1 - n2;
                n1 = n1 % n2; // will give the nearest multiple
            } else {
//                n2 = n2 - n1;
                n2 = n2 % n1;
            }
        }
        if(n1 == 0) {
            return  n2;
        }
        return n1;
    }


    public static int lcmoftwoNumbers (int n1 , int n2) {
        int gcd = gretestCommonDivisorOptimal(n1, n2);

        int lcm = (n1 * n2) / gcd;

        // Return the LCM
        return lcm;
    }

    public static int []  divisorOfAnumberBrute (int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        int[] divisors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors[index++] = i;
            }
        }

        return divisors;
    }

    public static void main(String[] args) {
        System.out.println(countdigitsofanumber(1213234343));
        System.out.println(countOddDigit(1357));
        System.out.println(reverseNumber(1357));
        System.out.println(palindromeCheck(12321));
        System.out.println(largestDigit(1234549));
        System.out.println(factorial(5));
        System.out.println(checkArmstrong(153));
        System.out.println(isPerfect(496));
        System.out.println(isPrime(1));
        System.out.println(gretestCommonDivisorBrute(5 , 10));
        System.out.println(gretestCommonDivisorBetter(5 , 10));
        System.out.println(gretestCommonDivisorOptimal(5,10));
        System.out.println(lcmoftwoNumbers(12,18));
        int [] arr = divisorOfAnumberBrute(6);
        System.out.println();
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
