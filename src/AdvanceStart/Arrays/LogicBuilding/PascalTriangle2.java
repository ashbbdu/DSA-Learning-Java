package AdvanceStart.Arrays.LogicBuilding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle2 {
    public static int pascalTriangleI(int r, int c) {
        r = r - 1;
        c = c - 1;
        int ans = 1;
        for(int i = 0 ; i < c ; i++) {
            ans = ans * (r - i);
            ans = ans / (i + 1);
        }
        return ans;
    }
    public static int[] pascalTriangleIIBrute(int r) {
        int [] nums = new int[r];
        for(int i = 1 ;  i <= r  ; i++) {
            nums[i-1] = pascalTriangleI(r , i);
        }
        return nums;
    }

    public static int[] pascalTriangleIIOptimal(int r) {
        int [] ans = new int[r];
        ans[0] = 1;
        for(int i = 1 ; i < r ; i++) {
            ans[i] = (ans[i - 1] * (r - i)) / i;
        }
        return ans;
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            long prev = al.get(i - 1);
            long val = prev * (rowIndex - i + 1) / i;
            al.add((int) val);
        }
        return al;
    }
    public static void main(String[] args) {
        System.out.println(getRow(3));
        int [] ans = pascalTriangleIIBrute(3);
        System.out.println(Arrays.toString(ans));
        int [] nums = pascalTriangleIIOptimal(6);
        System.out.println(Arrays.toString(nums));
    }
}
