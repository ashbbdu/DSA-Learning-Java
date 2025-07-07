package AdvanceStart.Arrays.LogicBuilding;

import java.util.ArrayList;
import java.util.List;


public class PascalTriangle3 {

    public static List<Integer> generateRow (int n) {
        List<Integer> ansRow = new ArrayList<>();
        int ans = 1;
        ansRow.add(1);
        for(int i = 1 ; i < n ; i++) {
            ans = ans * (n - i);
            ans = ans / i;
            ansRow.add(ans);
        }
        return ansRow;
    }

    public static List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++) {
            pascalTriangle.add(generateRow(i));
        }
        return pascalTriangle;
    }


    public static void main(String[] args) {
        System.out.println(pascalTriangleIII(4));

    }
}
