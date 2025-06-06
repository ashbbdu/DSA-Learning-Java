package NewStart.Basics.Strings;

import java.util.Arrays;

public class ValidAnagram {

    public static boolean anagramStringsBrute(String s, String t) {
        //your code goes here
        if(s.length() != t.length()) return  false;
        char [] a = s.toCharArray();
        char [] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a , b);
    }
    public static void main(String[] args) {
        System.out.println(anagramStringsBrute("anagram" , "nagaram"));
    }
}
