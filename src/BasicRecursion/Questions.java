package BasicRecursion;

public class Questions {
    static  int n  = 0;
    static int cnt = 0;
    public static void printNameTail() {

        if(n == 4 ) {
            return;
        }
//        this is tail recursion
        System.out.println("Ashish");
        n = n+1;
        printNameTail();

    }

    public static void  printNameHead () {
        if(cnt == 4 ) {
            return;
        }
//        this is head recursion
        cnt = cnt+1;
        printNameHead();
        System.out.println("Ashish");
    }


    public static void printXNNumberofTimes (int x , int n) {
        if(n == 0) {
            return;
        }
        System.out.println(x);
//        n = n - 1;
//        printXNNumberofTimes(x ,  n);
        printXNNumberofTimes(x , n -1);

}




    public static void print1toN (int start ,int n) {
        if(start > n) {
            return;
        }
        System.out.println(start);
        print1toN(start + 1  , n);
    }

    public static void printNto1 (int start ,int n) {
        if(n < start) {
            return;
        }
        System.out.println(n);
        printNto1(start , n - 1);

    }
    public static void main(String[] args) {
//        printNameTail();

//        printNameHead();
//        printXNNumberofTimes(4,4);
//        print1toN(1 , 4);
        printNto1(1,4);
    }

}
