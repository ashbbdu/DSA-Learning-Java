package AdvanceStart.Arrays.LogicBuilding;

public class PascalTriangle1 {
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
    public static void main(String[] args) {
        int r = 5;
        int c = 3;
        System.out.println(pascalTriangleI(r , c));
    }
}
