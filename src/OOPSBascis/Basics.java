package OOPSBascis;


class Test {
//    public  static  void printName() {
//        System.out.println("My name is Ashish Srivastava");
//    }


    public void printName() {
        System.out.println("My name is Ashish Srivastava");
    }
}

class SetAge {
    private static  void privateClass () {
        System.out.println("This is a private static function");
    }

    public void testTest () {
        privateClass();
    }

    int age;
    public  void setAge (int num) {

        age = num;
        System.out.println("The age is " + age);

    }
}



public class Basics {
//
//    public static void printLastName () {
//        System.out.println("Srivastava");
//    }

    public static void main (String[] args) {
        System.out.println("Hii");
//        Test.printName();

        Test t1 = new Test();
        t1.printName();

        SetAge a1 = new SetAge();
        a1.setAge(20);
        System.out.println(a1);
       SetAge a2 = new SetAge();
        a2.testTest();

    }
}
