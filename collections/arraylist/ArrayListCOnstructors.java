package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCOnstructors {
    public static void main(String[] args) {
        // this are the ways how we can create object for arraylist
        List arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add("balaji");
        System.out.println(arr);
        List arr1=new ArrayList(5);
        arr1.add(2);
        arr1.add(2);
        arr1.add(2);
        System.out.println(arr1.size());
        // ArrayList using the other ArrayList
        List arr2=new ArrayList(arr);
        System.out.println(arr2);


    }
}