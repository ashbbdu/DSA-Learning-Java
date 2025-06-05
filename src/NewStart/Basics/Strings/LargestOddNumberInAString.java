package NewStart.Basics.Strings;

public class LargestOddNumberInAString {
    public static String largeOddNum(String s) {
        //your code goes here
        int endIndex = -1;
        int startIndex = 0;
        for(int i = s.length() - 1 ; i >= 0 ; i--) {
            if((s.charAt(i) + '0') % 2 != 0 ) {
                endIndex = i;
                break;
            }
        }
        for (int i = 0; i <= endIndex; i++) {
            if (s.charAt(i) != '0') {
                startIndex = i;
                break;
            }
        }
        System.out.println(startIndex + " start index");
        return s.substring(startIndex , endIndex +1);
    }
    public static void main(String[] args) {
        String str = "0032579";
        System.out.println(largeOddNum(str));
        System.out.println('a' + '0');
    }
}
