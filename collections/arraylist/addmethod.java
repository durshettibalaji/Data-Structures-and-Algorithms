package collections.arraylist;


import java.util.ArrayList;
import java.util.List;

public class addmethod {
    public static void main(String[] args) {
        List arr=new ArrayList();
        //to add elemet at the last
        arr.add(1);
        arr.add(2);
        arr.add(3);
        //to add element at particular index
        arr.add(1,10);
        arr.add(2,20);


        List arr1=new ArrayList();
        arr1.addAll(arr);
        //every element in arr is added in arr1


        List arr2=new ArrayList();
        arr2.add(101);
        arr2.add(102);
        arr2.add(103);
        arr2.add(104);
        arr2.addAll(1,arr);
        // all the elements in arr are added at index of arr2
        System.out.println(arr2);
    }
}
