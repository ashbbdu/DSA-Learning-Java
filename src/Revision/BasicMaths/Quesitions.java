package Revision.BasicMaths;

public class Quesitions {

    public  static  int gcdBrute (int n1 , int n2) {
        int gcd = 0;
        for(int i = 1 ; i <= Math.min(n1 , n2) ; i++) {
            if((n1 % i) == 0 && (n2 % i == 0)) {
                gcd = i;
            }
        }
        return gcd;
    }


    public  static  int gcdBetter (int n1 , int n2) {
        int gcd = 0;
//        while (n1 == 0 || n2 == 0) {
//            if(n1 > n2) {
//                n1 = n1 - n2;
//            } else {
//                n2 = n2 - n1;
//            }
//        }
//        if(n1 == 0) {
//            gcd = n2;
//        } else  {
//            gcd = n1;
//        }
//        return gcd;

        for(int i = Math.min(n1 , n2) ; i >= 1 ; --i) {
            if((n1 % i) == 0 && (n2 % i == 0)) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }


    public  static  int gcdOptimal (int n1 , int n2) {
        int gcd = 0;
        while (n1 > 0 && n2 > 0) {
//            last me jake n1 will be 0 or n2  will be 0 in that condition the condition will break
            if(n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        if(n1 == 0) {
            gcd = n2;
        } else  {
            gcd = n1;
        }
        return gcd;
    }

    public static int countDivisors (int n) {
        int divCount = 0;
        for(int i = 1 ; i <= n; i++) {
            if(n % i == 0) {
                divCount = divCount + 1;
            }
        }
        return  divCount;
    }

    public static int[] divisors(int n) {
        int count = countDivisors(n);
        int cnt = 0;
        int [] arr = new int[count];
        for(int i = 1 ; i <= n ; i++ ) {
            if(n % i == 0) {
                arr[cnt++] = i;
            }
        }
        return arr;
    }

    public static int [] revIntArray (int [] arr) {
        int n = arr.length;
        int [] nums = new int[n];
        for (int i = 0 ;  i < n  ; i++) {
            nums[n - i - 1] = arr[i];
        }
        return nums;
    }

    public static int [] revIntArrayy (int [] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
        }
        return  arr;
     }

    public static void main(String[] args) {
        System.out.println(gcdBetter(35 , 10));
        System.out.println(gcdOptimal(35 , 10));
        int[] arr = divisors(7);
        for(int i = 0 ;  i < arr.length  ;i++) {
            System.out.println(arr[i]);
        }

//        System.out.println(countDivisors(6));

        int[] brr = {1,2,3,4,5,6};
//       int [] newBrr =  revIntArray(brr);
//        for(int i = 0 ;  i < newBrr.length ;i++) {
//            System.out.print(newBrr[i] + " ");
//        }
       int [] newBrr =  revIntArrayy(brr);
        for(int i = 0 ;  i < newBrr.length ;i++) {
            System.out.print(newBrr[i] + " ");
//        }
        }
    }
}

