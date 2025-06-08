package NewStart.Basics.Recursion;

import java.util.Vector;

public class ReverseAString {
    public static Vector<Character> reverse(Vector<Character> s , int start , int end) {
        if(start > end) {
            return s;
        }
        char temp = s.get(start);
        s.set(start , s.get(end));
        s.set(end ,temp);
        return reverse(s , start+1 , end - 1);

    }
    public static Vector<Character> reverseString(Vector<Character> s) {

        return reverse(s , 0 , s.size() - 1);
    }
    public static void main(String[] args) {
        Vector<Character> ch = new Vector<>();
//        ch.add('h');
//        ch.add('e');
//        ch.add('l');
//        ch.add('l');
//        ch.add('o');
//        ch.add('b');
//        ch.add('y');
//        ch.add('e');
        ch.add('h');
        ch.add('a');
        ch.add('n');
        ch.add('n');
        ch.add('a');
        ch.add('h');

        System.out.println(reverseString(ch));
//        System.out.println(ch.size() - 1);

    }
}
