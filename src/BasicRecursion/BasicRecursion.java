package BasicRecursion;

//The time complexity of a recursive function is generally based on the number of recursive calls made. If a function makes one recursive call, the time complexity is O(n), where n is the depth of the recursion.

//The space complexity of a recursive function is determined by the maximum depth of the recursive call stack. If the function reaches a maximum recursion depth of n, the space complexity is O(n).

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
//        Tail Recursion => call the function then do the job

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
