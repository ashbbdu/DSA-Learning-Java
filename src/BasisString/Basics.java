package BasisString;

public class Basics {
    public static void main(String[] args) {
        String name = "Ashish";
        System.out.println(name.charAt(0));
        System.out.println(name.length());

        String fullName = name.concat(" Srivastava");
        int val = 'c';
        System.out.println(val);
        System.out.println(fullName);
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,3));
    }
}
