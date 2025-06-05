package NewStart.Basics.Strings;

import java.util.Stack;
import java.util.Vector;

public class ReverseStringArray {
    public static void reverseStringBrute (Vector <Character> s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.size()  ; i++) {
            st.push(s.elementAt(i));
        }
        for(int i =0 ; i < s.size() ; i++) {
            s.set(i , st.pop());
        }
    return;
    }


    public static void reverseStringOptimal (Vector <Character> s) {
        int start = 0;
        int end = s.size() - 1;
        while(start < end) {
            char temp = s.get(start);
            s.set(start , s.get(end));
            s.set(end , temp);
            start++;
            end--;
        }
        return;
    }

    public static void main(String[] args) {
        Vector<Character> arr = new Vector<>();
        arr.add('a');
        arr.add('b');
        arr.add('c');
        arr.add('d');
        arr.add('e');
        reverseStringBrute(arr);
        System.out.println(arr);
        reverseStringOptimal(arr);
        System.out.println(arr);
    }
}
