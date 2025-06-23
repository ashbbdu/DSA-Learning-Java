package NewStart.Basics.Hashing.HashingConcepts;

public class Hashing {
    public static int simpleHash(String str) {
        int hash = 0;
        for (int i = 0; i < str.length(); i++) {
            hash += (int) str.charAt(i); // or simply: hash += str.charAt(i);
        }
        return hash;
    }
    public static void main(String[] args) {
        System.out.println(simpleHash("abc"));
    }
}
