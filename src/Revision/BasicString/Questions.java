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
    public static void main(String[] args) {
//        char [] arr = {'h' , 'e' , 'l' , 'l' , 'o'};

        Vector<Character> arr =  new Vector<>();
        arr.add('h');
        arr.add('e');
        arr.add('l');
        arr.add('l');
        arr.add('o');
        System.out.println(arr);
        reversStringArr(arr);
        System.out.println(arr);

    }
}
