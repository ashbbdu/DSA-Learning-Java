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
            }
//            not required but check with other test cases as well
//            else if(pow(i , N , M) > M) {
//                break;
//            }
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

//     revision

    public static int findPowSum(int N, int val , int M) {
        int ans = 1;
        for(int i = 1 ;  i <= M ; i++) {
            ans = ans * i;
        }
        return ans;
    }

    public static int NthRootBrute1(int N, int M) {
        for(int i = 1 ; i <= N ; i++) {
            if(findPowSum(N , i , M) == N) {
                return i;
            } else if(findPowSum(N , i , M) >  N) {
                return -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(NthRootBrute(9 , 512));
        System.out.println(NthRootOptimal(9 , 512));
        System.out.println(NthRootBrute1(9 , 512));
    }
}
