package NewStart.Basics.Strings;

public class RotateString {
    public static boolean rotateString(String s, String goal) {
//        base case
        if(s.length() != goal.length()) return false;
        for(int i =0 ; i < s.length() ;i++) {
           String rotated = s.substring(i , s.length()) + s.substring(0 , i);
            System.out.println(rotated);
            if(rotated.equals(goal)) {
                return true;
            }
        }

        return  false;
    }
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "adeac"));
        String str = "abcde";
//        String a =  str.substring(0 , str.length()) + str.substring(0,0);
//        String s =  str.substring(1 , str.length()) + str.substring(0,1);
//        String d =  str.substring(2 , str.length()) + str.substring(0,2);
//        String e =  str.substring(3 , str.length()) + str.substring(0,3);
//        String f =  str.substring(4 , str.length()) + str.substring(0,4);
//        String g =  str.substring(5 , str.length()) + str.substring(0,5);
//        System.out.println(a);
//        System.out.println(s);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);
//        System.out.println(g);
    }
}
