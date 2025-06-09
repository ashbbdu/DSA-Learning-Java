package NewStart.Basics.Recursion;

public class PalindromeCheck {
    public static boolean palCheck(String s , int start , int end) {
        //your code goes here
        if(start > end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return palCheck(s , start +1 , end -1);
    }
    public static boolean palindromeCheck(String s) {
        //your code goes here
       return palCheck(s , 0 , s.length() -1);
    }
    public static void main(String[] args) {
        System.out.println(palindromeCheck("aabbcccdbbaa"));
    }
}
