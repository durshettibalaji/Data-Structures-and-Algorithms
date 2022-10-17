package collections.HashSet;

import java.util.HashSet;

public class UnionOfArray {
    public static void main(String[] args) {
        HashSet s=new HashSet();
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={3,4,5,6,7,8};
        for(int i=0;i< arr1.length;i++)
        {
            s.add(arr1[i]);
        }
        for(int i=0;i< arr2.length;i++)
        {
            s.add(arr2[i]);
        }
        System.out.println(s);
    }
}
