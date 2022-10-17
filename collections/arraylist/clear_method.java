package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class clear_method {
    public static void main(String[] args) {
        List arr=new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr);
        arr.clear();
        // removes all the elements from arraylist
        System.out.println(arr);
    }
}
