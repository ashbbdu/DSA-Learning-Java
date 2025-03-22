package JavaCollections.Interface;

import java.util.Stack;

public class StackTut {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println(st);
//        peek() gives the last element that is pushed in
        System.out.println(st.peek());

//        pop() removes the last element that is pushed in
        st.pop();
        System.out.println(st);
    }
}
