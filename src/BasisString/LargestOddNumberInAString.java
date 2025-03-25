package BasisString;

public class LargestOddNumberInAString {
    public static String largeOddNum () {
        String num = "0032579";
        int oddIndex = -1;
        int lastZeroIndex = -1;
//        int i ;
        for(int i = num.length() - 1 ; i >= 0 ; i--) {
            if((num.charAt(i) + '0')  % 2 == 1) {
                oddIndex = i ;
                break;
            }
        }
        System.out.println(oddIndex);

        if(oddIndex == -1) return "";
//        i = 0;
//        while (i <= oddIndex && num.charAt(i) == '0') i++;
//        System.out.println(i);
//        System.out.println(num.substring(i , oddIndex+1));

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '0') {
                lastZeroIndex = i;
            } else {
                break;
            }
        }

        System.out.println(lastZeroIndex);
        System.out.println(num.substring(lastZeroIndex +1 , oddIndex + 1));


        return  "";
    }

    public static String largeOddNum1(String s) {
        int oddIndex = -1;
        int lastZeroIndex = -1;
//        int i ;
        for(int i = s.length() - 1 ; i >= 0 ; i--) {
            if((s.charAt(i) + '0')  % 2 == 1) {
                oddIndex = i ;
                break;
            }
        }
        System.out.println(oddIndex);

        if(oddIndex == -1) return "";
//        i = 0;
//        while (i <= oddIndex && num.charAt(i) == '0') i++;
//        System.out.println(i);
//        System.out.println(num.substring(i , oddIndex+1));

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                lastZeroIndex = i;
            } else {
                break;
            }
        }
        return s.substring(lastZeroIndex +1 , oddIndex + 1);
    }
    public static void main(String[] args) {
        largeOddNum();
        String str = "0032579";
        System.out.println(largeOddNum1(str) + " result");
    }



}
