package AdvanceStart.BinarySearch.OnAnswers;

public class FindNthRootOfANumber {
    public static long helper(int I, int N) {
        long ans = 1;
        for(int i = 1; i <= N ; i++) {
            ans = (long)Math.pow(I , N);
        }
        return ans;
    }
    public static int NthRoot(int N, int M) {
        for(int i = 1 ; i <= M ; i++) {
            if(helper(i , N) == M) {
               return i;
            } else if (helper(i, N) > M) {
                break;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(NthRoot(4 , 81));
    }
}
