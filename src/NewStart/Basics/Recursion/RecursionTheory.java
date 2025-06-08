package NewStart.Basics.Recursion;

public class RecursionTheory {
    public static void printName (int n) {
        while (n == 0) {
            return;
        }

        System.out.println("Ashish Srivastava");
        printName(n-1);
    }
    public static void main(String[] args) {
        printName(5);
    }
}
