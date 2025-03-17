package OOPSBascis;


//class Testt {
//    public  int sum (int n1 ,int n2) {
//        return  n1 + n2;
//    }
//}

// constructor

class Const {
    public Const () {
        System.out.println("Test constructor  called");
    }
    public void printHello () {
        System.out.println("Hii");
    }
}

public class Basics2 {

    public static void main(String[] args) {
//        Testt t1 = new Testt();
//        System.out.println(t1.sum(1,2));
//         constructor
        Const c1 = new Const();
        c1.printHello();
    }
}
