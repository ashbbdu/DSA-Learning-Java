package NewStart.Basics.Strings;

import java.util.Arrays;

public class LargestCommonPrefix {
    public static String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length - 1];
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i < Math.min(first.length() , last.length()) ; i++) {
            if(first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }


        return ans.toString();
    }

    public static void main(String[] args) {
        String [] str = {"flowers" , "flow" , "fly", "flight" };
        System.out.println(longestCommonPrefix(str));
    }
}
