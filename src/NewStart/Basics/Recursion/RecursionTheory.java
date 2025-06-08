package NewStart.Basics.Recursion;

public class RecursionTheory {
    public static int count = 0;
    public static int cnt = 0;
    public static void printName (int n) {
        while (n == 0) {
            return;
        }
        printName(n-1);
        System.out.println("Ashish Srivastava");

    }

    public static void printName4TimesHead () {
        if(count == 4) {
            return;
        }
        count = count + 1;
        printName4TimesHead();
        System.out.println("AS " + count);

    }

    public static void printName4TimesTail () {
        if(cnt == 4) {
            return;
        }
        cnt = cnt + 1;

        System.out.println("AS Tail " + cnt);
        printName4TimesTail();

    }
    public static void main(String[] args) {
        printName(5);
        printName4TimesHead();
        printName4TimesTail();
    }
}
