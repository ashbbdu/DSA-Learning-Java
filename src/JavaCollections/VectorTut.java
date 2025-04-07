package JavaCollections;

import java.util.Vector;

public class VectorTut {
    public static Vector<Integer> myfun () {
        Vector<Integer> vc = new Vector<>();
        vc.add(1);

        return  vc;
    }
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(2);
        v.add(2);
        System.out.println(v);
        System.out.println(v.size());

        System.out.println(myfun());;
    }
}
