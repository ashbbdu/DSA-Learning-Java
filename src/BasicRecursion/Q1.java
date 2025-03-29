package BasicRecursion;


//Print x n number of times
public class Q1 {
    public static void printxntimes (int x , int n) {
        if(n == 0) {
            return;
        }
        System.out.println(x);
        printxntimes(x  , n - 1);
    }

//    Print 1 to N
    public static void print1ton (int start ,int n) {
        while (start > n) {
            return;
        }
        System.out.println(start);
        print1ton(start+1 , n);

//        if i will use tail recursion it will print 1 to N into N to 1 form
//        print1ton(start+1 , n);
//        System.out.println(start);

    }

//    Print N to 1
public static void printnto1 (int start ,int n) {
    if (start < n) {
        return;
    }
    System.out.println(start);
    printnto1(start - 1  , n);
}

//recursion function to remove extra (start) variable

 public static void removeextrastartvariable (int n) {
        if (n==0) {
            return;
        }
//        Tail recursion
//        removeextrastartvariable(n - 1);
//     System.out.println(n);

//     Head recursion
     System.out.println(n);
     removeextrastartvariable(n - 1);



 }

    public static void main(String[] args) {
        printxntimes(3 , 4);
        System.out.println("Q2");
        print1ton(1 , 5);
        System.out.println("Q3");
        printnto1(5 , 1);

        System.out.println("Q4");
        removeextrastartvariable(5);
    }
}
