package Revision.BasicString;

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
    }
}
