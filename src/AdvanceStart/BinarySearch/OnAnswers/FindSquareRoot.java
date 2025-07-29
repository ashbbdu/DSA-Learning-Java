package AdvanceStart.BinarySearch.OnAnswers;

public class FindSquareRoot {
    public static long floorSqrt(long n) {
       for(int i = 1 ;  i <= n ; i++) {
           if((long) i * i == n) {
               return i;
           } else if (floorSqrt(n) > n) {
               return i -1;
           }
       }
       return -1;
    }

    public static long floorSqrtBrute(long n) {
        for(int i = 1 ; i <= n; i++) {
            if((long)i * i == n) {
                return i;
            } else if ((long) i * i > n) {
                return i -1;
            }
        }
        return -1;
    }

    public static long floorSqrtOptimal(long n) {
        long start = 1;
        long end = n;
        long ans = -1;
        while(start <= end) {
            long mid = start + (end - start) / 2;

            if(mid * mid <= n) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }



//    public static long floorSqrtOptimal(long n) {
//        long start = 1;
//        long end = n;
//
//        long ans = 1;
//        if(n == 0) return 0;
//        if(n == 1) return 1;
//        while(start <= end) {
//            long mid = start + (end - start)/2;
//            if(mid * mid <= n) {
//                ans = mid;
//                start = mid + 1;
//            } else {
//              end = mid - 1;
//
//            }
//
//        }
//        return ans;
//    }


    public static void main(String[] args) {
//        int n = 380980991;
        long n = 26;
        System.out.println(floorSqrtOptimal(n));
        System.out.println(floorSqrtBrute(n));
    }
}
