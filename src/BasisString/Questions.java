package BasisString;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class Questions {


    public static void reverseStringBrute (Vector<Character> arr) {
        Stack<Character> sc = new Stack<>();
        for(char c : arr ) {
            sc.push(c);
        }
        for (int i = 0; i < arr.size(); ++i) {
            arr.set(i, sc.pop());
        }
        return;
    }

    public static void reverseStringOptimized (Vector<Character> arr) {
       int start = 0;
       int end = arr.size() - 1;
       char temp;
       while (start < end) {
          temp = arr.get(start);
          arr.set(start , arr.get(end));
          arr.set(end , temp) ;
          start++;
          end--;
       }
    }


    public static boolean checkPalindrome (String str) {
        int start = 0;
        int end = str.length() - 1;
        while(start < end) {
            if(str.charAt(start) !=  str.charAt(end)) {
                return  false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static String largestOddNumber (String str) {
        int zeroIndex = -1;
        int oddNumberIndex = -1;

        for(int i = str.length() - 1 ; i >= 0 ; i--) {
            if((str.charAt(i) + '0') % 2 == 1 ) {
                oddNumberIndex = i;
                break;
            }
        }

        if(oddNumberIndex == -1) return "";
        for(int i = 0 ; i < str.length() ; i++) {
            if((str.charAt(i)) == '0') {
                zeroIndex = i;
            } else {
                break;
            }
        }

        return  str.substring(zeroIndex + 1 , oddNumberIndex+1);
    }


    public static boolean validAnagramBrute (String a , String b) {
        char [] arr1 = a.toCharArray();
        char [] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1 , arr2);
    }

//    Longest common prefix

    public static String longestCommonPrefix (String [] arr) {
        Arrays.sort(arr);
        String first = arr[0];
        StringBuilder ans = new StringBuilder();
        String last = arr[arr.length - 1];
        for(int i = 0 ; i < Math.min(first.length() , last.length()) ; i++) {
            if(first.charAt(i) == last.charAt(i)) {
                ans = ans.append(first.charAt(i));
            } else {
               break;
            }
        }
        return  ans.toString();
    }
//    Input : s = "abcde" , goal = "cdeab"
    public static boolean rotateStringBrute (String str1 , String str2) {
        if(str1.length() != str2.length()) return false;
        for(int i = 0 ; i < str1.length() ; i++) {
            String right = str1.substring(i);
            String left = str1.substring(0 , i);
            if((right + left).equals(str2)) {
                return true;
            }
        }
        return  false;
    }


    public static boolean rotateStringOptimal (String str1 , String str2) {
        if(str1.length() != str2.length()) return false;
        String combinedStr = str1 + str2;
        return  combinedStr.contains(str2);
    }


//    public static boolean rotateString (String s , String goad) {
//        int sIndex = 0;
//        int goadIndex = goad.length() - 1;
//
//        if(goad.length() != s.length()) return  false;
//
//        for(int i = 0 ; i < s.length() ; i++) {
//           s = s.substring(sIndex , goadIndex - 1)
//        }
//
//    }

    public static void main(String[] args) {
        String name = "ashish";
        name = name + 'a';
        System.out.println(name);
        System.out.println(name.charAt(1));

        Vector vc = new Vector();
        vc.add('a');
        vc.add('b');
        vc.add('c');
        vc.add('d');
//        System.out.println(vc);
//        System.out.println(vc.size());

//        reverseStringOptimized(vc);


        System.out.println(vc);


        reverseStringBrute(vc);
        System.out.println(vc);

        String st = "abcba";
        System.out.println(checkPalindrome(st));


        System.out.println(largestOddNumber("5347"));


        String [] arr = {"dog","racecar","car"};

//        car , dog ,racecar

        System.out.println(longestCommonPrefix(arr));;

//        char [] a1 = {'a' , 'b'};
//        char [] a2 = {'a' , 'b'};
//        System.out.println("Test");
//        System.out.println(Arrays.equals(a1 , a2));
//        System.out.println("Test");
        System.out.println(validAnagramBrute("anagram" , "nagaraam"));
//        Input : s = "abcde" , goal = "cdeab"

        System.out.println("Brute Rotate String");
        System.out.println(rotateStringBrute("abcde" , "cdeab")); // add this solutions in the sheet
        System.out.println(rotateStringOptimal("abcde" , "cdeab"));
    }

}
