package collections.arraylist;

import java.util.ArrayList;

public class toArray_method {
    public static void main(String[] args) {
        ArrayList arr=new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        Object[] array= arr.toArray();
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }

    }
}
