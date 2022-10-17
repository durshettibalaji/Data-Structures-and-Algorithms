package collections.arraylist;

import java.util.ArrayList;

public class subList_method {
    public static void main(String[] args) {
        ArrayList arr=new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr.subList(1,4));
    }
}
