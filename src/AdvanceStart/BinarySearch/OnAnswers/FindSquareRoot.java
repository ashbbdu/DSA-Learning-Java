package AdvanceStart.BinarySearch.OnAnswers;

public class FindSquareRoot {
    public static long floorSqrtOptimal(long n) {
        long start = 1;
        long end = n;
        long mid = start + (end - start)/2;

        long ans = 1;
        if(n == 0) return 0;
        while(start <= end) {
            if(mid * mid <= n) {
                ans = mid;
                start = mid + 1;
            } else {
              end = mid - 1;

            }
            mid = start + (end - start)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n =50;
        System.out.println(floorSqrtOptimal(n));
    }
}
