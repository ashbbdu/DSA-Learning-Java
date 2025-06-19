package NewStart.Advance.Arrays.Medium_FAQS;

import java.util.Arrays;

public class PascalTriangle2 {
    public static int pascalTriangleI(int r, int c) {
        long res = 1; //because i have to return
        if(c > r) c = r;
        for(int i = 0 ; i < c ; i++) {
            res = res * (r - i);
            res = res/(i+1);

        }
        return (int)res;
    }
    public static int[] pascalTriangleIIExtreameBrute(int r) {
        int [] arr = new int[r];
        for(int i = 1; i <= r ; i++) {
            arr[i - 1] = pascalTriangleI(r-1 , i-1);
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pascalTriangleIIExtreameBrute(4)));
    }
}
