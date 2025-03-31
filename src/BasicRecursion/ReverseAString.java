package BasicRecursion;

import java.util.Vector;

public class ReverseAString {
//    since we are changing the original Character array that is why we dont have to make a copy of it.
   public static void reverse (Vector<Character> s , int left , int right) {
        if(left > right) {
            return;
        }
       char temp = s.get(left);
        s.set(left , s.get(right));
        s.set(right , temp);
        reverse(s , left + 1 , right - 1);
    }
    public static Vector<Character> reverseString(Vector<Character> s) {
        int left = 0;
        int right = s.size() - 1;
        reverse(s , left , right);
        return s;
    }
    public static void main(String[] args) {
        Vector<Character> vector = new Vector<>();
        vector.add('H');
        vector.add('E');
        vector.add('L');
        vector.add('L');
        vector.add('O');
       Vector <Character> ash = reverseString(vector);
        System.out.println(ash);

    }
}
