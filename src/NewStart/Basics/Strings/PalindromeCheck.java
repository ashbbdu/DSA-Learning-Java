package NewStart.Basics.Strings;

public class PalindromeCheck {
    public static boolean isPalindromeLC(String s) {
        int start = 0;
//        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int end = s.length() -1;
        while(start < end) {

            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }

            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            if( Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean palindromeCheck(String s) {
        int start = 0;
        int end = s.length() -1;
        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "abba";
        System.out.println(palindromeCheck(str));

        System.out.println(isPalindromeLC("a."));

    }
}
