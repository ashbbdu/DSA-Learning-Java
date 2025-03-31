package BasicRecursion;

public class CheckPalindrome {

    public static boolean reverse (int left , int right , String str) {
        if(left >= right) {
            return true; // that means string is a palindrome
        }

        if(str.charAt(left)  != str.charAt(right)) {
            return  false;
        }


        return reverse(left+1 , right-1 , str);

    }

    public static boolean palindromeCheck(String s) {
        int left = 0;
        int right = s.length() - 1;
       return reverse(0 , right , s);
    }
    public static void main(String[] args) {
        String s = "nitin";
        System.out.println(palindromeCheck(s));
    }
}
