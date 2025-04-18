package BasicRecursion;

import java.util.ArrayList;
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

    public static boolean palindrome (String s , int left , int right) {
        if(left >= right) return  true;
        if(s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return palindrome(s , left + 1 , right - 1);
    }

    public static boolean checkPalindrome (String s) {
        int left = 0;
        int right = s.length() - 1;
        return palindrome(s , left , right);
    }

    public static void reverse (int left , int right , int [] arr) {
        if(left >= right) {
            return ;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverse(left + 1 , right - 1, arr);
    }
    public static int[] reverseArray(int[] nums) {
        //your code goes here
        int left = 0;
        int right = nums.length - 1;
        reverse(left , right , nums);
        return nums;
    }

    public static boolean sorted (ArrayList <Integer> al , int left , int right) {
        if (right >= al.size()) {
//            agar yaha tk chla hai to array sorted hai
            return true;
        }
        if (al.get(left) > al.get(right)) {
            return false;
        }
        return sorted(al, left + 1, right + 1);
    }

    public static boolean isSorted (ArrayList <Integer> al) {
        if (al.size() <= 1) {
//            if the size of array is 1 then by default it is sorted
            return true;
        }
        return sorted(al, 0, 1);
    }

    public static int cntt = 0;

    public static int findMul (int num , int start ) {
        if(start > 5) {
            return 0;
        }
        int thisCount = (num % start == 1) ? 1 : 0;
       return thisCount + findMul(num ,  start +1 );

    }

    public static boolean checkPrime(int num) {
        //your code goes here
        return findMul(num , 1) == 2;
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
        System.out.println(arr.length);
        System.out.println(arrSum(arr , 0));

        Vector<Character> s = new Vector<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');

        reverseString(s);
        System.out.println(s);
        System.out.println("Check Palindrome");
        System.out.println(checkPalindrome("nitin"));


        int brr [] = {1,2,3 , 4,5};
       int [] crr = reverseArray(brr);
        for(var el : crr) {
            System.out.print(el + " ");
        }
        System.out.println();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(5);
        al.add(4);
        al.add(5);
        System.out.println(al);

        System.out.println(isSorted(al));
        System.out.println();
//        System.out.println(findMul(5 ,1));
        System.out.println(checkPrime(6));
    }

}
