package NewStart.Basics.Recursion;

import java.util.Vector;

public class TestFileRecusion {
    public static void main(String[] args) {
        Vector<Character> ch = new Vector<>();
        ch.add('h');
        ch.add('e');
        ch.add('l');
        ch.add('l');
        ch.add('o');
//        System.out.println(reverseString(ch));
//        System.out.println(ch.size() - 1);
        System.out.println(ch.get(1));
        ch.set(1 , 'Y');
        System.out.println(ch);
    }
}
