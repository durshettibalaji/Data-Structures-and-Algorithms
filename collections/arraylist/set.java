package collections.arraylist;

import java.util.ArrayList;

public class set {
    public static void main(String[] args) {
        ArrayList arr=new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.set(2,1234);
        System.out.println(arr);
    }
}
