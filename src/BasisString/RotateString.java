package BasisString;

import java.util.Arrays;

public class RotateString {
    public static boolean rotaateAndCompareStringOptimal (String str , String tar) {
        if (str.length() != tar.length()) {
            return false;
        }
        String mystr = str + str;
        return mystr.contains(tar);

    }

    public static boolean rotaateAndCompareString (String str , String tar) {
        if (str.length() != tar.length()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            String rotated = str.substring(i) + str.substring(0, i);
            if (rotated.equals(tar)) {
                return true;  // Return true if a match is found
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "abcde";
        String tar = "cdeab";
        String a = str.substring(1);
//        System.out.println(a);


        System.out.println( rotaateAndCompareString(str , tar));
        System.out.println(rotaateAndCompareStringOptimal(str , tar));

    }
}
