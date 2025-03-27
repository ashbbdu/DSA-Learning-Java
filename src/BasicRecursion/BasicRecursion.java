package BasicRecursion;

public class BasicRecursion {
    static int count = 0;
    static int cnt = 0;
    public  static void printName () {
        while (count >= 4){
            return;
        }
//        Head Recursion => Do you job then call the function => do the dry run in office tomorrow
        System.out.println("hi");
        count = count + 1;
        printName();

    }

    public  static void printNameTailRec () {
        while (cnt >= 4){
            return;
        }
//        Tail Recursion => call the function then do the job => do the dry run in office tomorrow

        cnt = cnt + 1;
        printNameTailRec();
        System.out.println("hi");

    }
    public static void main(String[] args) {

        printName();
        System.out.println("Tail Rec Below");
        printNameTailRec();
    }
}
