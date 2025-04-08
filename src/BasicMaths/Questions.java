package BasicMaths;

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
    }
}
