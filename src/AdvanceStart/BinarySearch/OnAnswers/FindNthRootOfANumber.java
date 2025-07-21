package AdvanceStart.BinarySearch.OnAnswers;

public class FindNthRootOfANumber {
    public static long pow(int I, int N ,int M) {
        long ans = 1;
        for(int i = 1 ; i <= N ; i++) {
            ans = ans * I;
            if (ans > (long)M) return (long)M + 1;
        }
        return ans;
    }
    public static int NthRootBrute(int N, int M) {
        for(int i = 1; i <= M ; i++) {
            if(pow(i , N , M ) == M) {
                return i;
            } else if(pow(i , N , M) > M) {
                break;
            }
        }
        return -1;
    }
    public static int NthRootOptimal(int N, int M) {
        if (N == 1) return M;
        int start = 1;
        int end = M;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long midPower = pow(mid, N , M);
            if (midPower == M) {
                return mid;
            } else if (midPower > M) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(NthRootBrute(9 , 512));
        System.out.println(NthRootOptimal(9 , 512));
    }
}
