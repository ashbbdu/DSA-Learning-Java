package BasicRecursion;

import java.util.Vector;

public class Questions {
    static  int n  = 0;
    static int cnt = 0;
    public static void printNameTail() {

        if(n == 4 ) {
            return;
        }
//        this is tail recursion
        System.out.println("Ashish");
        n = n+1;
        printNameTail();

    }

    public static void  printNameHead () {
        if(cnt == 4 ) {
            return;
        }
//        this is head recursion
        cnt = cnt+1;
        printNameHead();
        System.out.println("Ashish");
    }


    public static void printXNNumberofTimes (int x , int n) {
        if(n == 0) {
            return;
        }
        System.out.println(x);
//        n = n - 1;
//        printXNNumberofTimes(x ,  n);
        printXNNumberofTimes(x , n -1);

}


    public static void print1toN (int start ,int n) {
        if(start > n) {
            return;
        }
        System.out.println(start);
        print1toN(start + 1  , n);
    }


    public static void printNto1 (int start ,int n) {
        if(n < start) {
            return;
        }
        System.out.println(n);
        printNto1(start , n - 1);

    }

    public static void printNto1WithoutStartVar (int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printNto1WithoutStartVar(n - 1);
    }


    public static void print1toNWithoutStartVar (int n) {
        if(n == 0) {
            return;
        }
        print1toNWithoutStartVar(n - 1);
        System.out.println(n);

    }


//    Sum of first N numbers
    public static int sumoffirstNumbers (int n) {
        if(n == 0) {
            return 0;
        }
       return  n + sumoffirstNumbers(n - 1);
    }

//    Factorial of a given number
    public static int factorialOfANumber (int n) {
        if(n <= 1) {
            return 1;
        }
        return n * factorialOfANumber(n -1);
    }

    public static int sum (int [] arr , int left) {
        if(left >= arr.length) {
            return 0;
        }
        return arr[left] + sum(arr , left + 1);
    }

    public static int arrSum (int [] arr , int left) {
       return sum(arr, 0);
    }

//    Sum of array elements


    public  static void reverse(Vector<Character> s , int left , int right) {
        if(left >= right) {
        return;
        }
        char temp = s.get(left);
        s.set(left, s.get(right));
        s.set(right, temp);
        reverse(s, left + 1, right - 1);

    }

    public static Vector<Character> reverseString(Vector<Character> s) {
        int left = 0;
        int right =  s.size() - 1;
         reverse(s ,left , right);
         return s;
    }

    public static void main(String[] args) {
//        printNameTail();

//        printNameHead();
//        printXNNumberofTimes(4,4);
//        print1toN(1 , 4);
        printNto1(1,4);
        System.out.println();
        System.out.println();
        printNto1WithoutStartVar(4);
        System.out.println();
        System.out.println();
        print1toNWithoutStartVar(4);
        System.out.println();
        System.out.println();
        System.out.println(sumoffirstNumbers(4));
        System.out.println();
        System.out.println();
        System.out.println(factorialOfANumber(5));

        int [] arr = {1,2,3};
        System.out.println(arrSum(arr , 0));

        Vector<Character> s = new Vector<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');

        reverseString(s);
        System.out.println(s);
    }

}
