package collections.arraylist;

import java.util.ArrayList;

public class remove_method extends ArrayList{
    public static void main(String[] args) {
        remove_method ar = new remove_method();
//        ArrayList arr=new ArrayList();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
//        arr.add(6);
//        arr.add(7);
//        arr.add(8);
//        arr.add(9);
//        arr.add(10);
//        arr.add(11);
//        arr.add(12);
//        arr.remove(2);
//        arr.remove(3);
        System.out.println(ar);
        ar.removeRange(1,3);
        System.out.println(ar);
    }
}
