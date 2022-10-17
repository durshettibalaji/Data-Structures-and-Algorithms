package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class clone_method {
    public static void main(String[] args) {
        int a= 0x5;
        List<Integer> arr=new ArrayList<Integer>();
//        List arr1=new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        ArrayList arr1= (ArrayList) ((ArrayList<?>) arr).clone();
        System.out.println(arr1);

    }
}
