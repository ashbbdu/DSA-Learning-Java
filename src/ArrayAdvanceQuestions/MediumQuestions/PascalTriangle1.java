package ArrayAdvanceQuestions.MediumQuestions;

import java.math.BigInteger;

public class PascalTriangle1 {

    public static int factorial (int n) {
        long fact = 1;
        for(int i = 1 ; i <= n ; i++) {
//            System.out.println(fact + " * " +  i + " = " + fact*i);
            fact = fact * i;
        }
        return (int)fact;
    }

    public static int pascalTriangle1Brute (int r , int c) {

        long ans = factorial(r - 1) / (factorial(c-1) * factorial(r - c));
        return (int)ans;
    }
    public static void main(String[] args) {
        System.out.println(pascalTriangle1Brute(22 ,2));
        System.out.println(factorial(12));
    }
}
