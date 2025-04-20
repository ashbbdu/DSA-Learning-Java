package Revision.BasicString;

import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class Questions {
    public static void reversStringArr(Vector<Character> s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.size(); i++) {
            st.push(s.get(i));
        }

        for(int i = 0 ; i < s.size(); i++) {
            s.set(i , st.peek());
            st.pop();
        }

    }

    public static void reversStringArrOptimal(Vector<Character> s) {
        int start = 0;
        int end = s.size() - 1;
        while(start <= end) {
            char temp = s.get(start);
            s.set(start , s.get(end));
            s.set(end , temp);
            start++;
            end--;
        }
    }

    public static boolean isPalindrome (String s) {
        int start = 0;
        int end = s.length() - 1;
        while(start <= end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static String largestOdd (String s) {
        int zeorIndex = -1;
        int oddIndex = -1;
        for(int i = s.length() - 1 ; i >= 0 ; i--) {
            if((s.charAt(i) + '0') % 2 != 0) {
                oddIndex = i;
                break;
            }
        }
        if(oddIndex == -1) return "";

        for(int i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i) == '0') {
                zeorIndex = i;
            }
        }

        return  s.substring(zeorIndex+1 , oddIndex+1);
    }

    public static String largestCommonPrefix (String [] s) {
        Arrays.sort(s);
        StringBuilder ans = new StringBuilder();
        String start = s[0];
        String end = s[s.length - 1];
        for(int i = 0 ; i < Math.min(start.length() , end.length()) ; i++) {
            if(start.charAt(i) == end.charAt(i)) {
              ans =  ans.append(start.charAt(i));
            }
        }
        return ans.toString();
    }

    public static boolean rotateString (String o , String g) {
        if(o.length() != g.length()) return false;
        for(int i = 0 ; i < o.length() ; i++) {
            String right = o.substring(i);
            String left = o.substring(0 , i);
            if((right+left).equals(g)) {
                return true;
            }
        }
        return false;
    }

    public static boolean rotateStringOptimal (String o , String g) {
        if(o.length() != g.length()) return false;
        String str = o + o;
        return str.contains(g);
    }

    public static boolean validAnagram (String s, String t) {
        if(s.length() != t.length()) return false;
        char [] str1 = s.toCharArray();
        char [] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
//        for(int i = 0 ; i < str1.length ; i++) {
//            if(str1[i] != str2[i]) {
//                return false;
//            }
//        }
        return   Arrays.equals(str1 , str2);
    }
    public static void main(String[] args) {
//        char [] arr = {'h' , 'e' , 'l' , 'l' , 'o'};

        Vector<Character> arr =  new Vector<>();
        arr.add('h');
        arr.add('e');
        arr.add('l');
        arr.add('l');
        arr.add('o');
        System.out.println(arr);
//        reversStringArr(arr);
//        System.out.println(arr);
        reversStringArrOptimal(arr);
        System.out.println(arr);

        String str = "aabbaaa";
        System.out.println(isPalindrome(str));

//        0214638
        System.out.println();
        System.out.println(largestOdd("000214638"));

        String [] brr = {"flowers" , "flow" , "fly", "flight" };
        System.out.println(largestCommonPrefix(brr));
//        for(int i = 0 ; i < brr.length ; i++) {
//            System.out.println(brr[i]);
//        }



        String original = "abcde";
        String goal = "cdeab";

        System.out.println(rotateString(original , goal));
        System.out.println(original.substring(1));
        System.out.println(original.substring(0,1));

        System.out.println(rotateStringOptimal("abcde" , "cdeab"));


        System.out.println(validAnagram("anagram" , "nagaram"));
    }
}
