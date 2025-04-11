package BasisString;

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

    }
}
