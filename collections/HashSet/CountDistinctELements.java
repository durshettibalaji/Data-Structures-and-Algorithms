package collections.HashSet;

import java.util.HashSet;

public class CountDistinctELements {
    public static void main(String[] args) {
        int[] arr={1,2,2,4,3,1,5,3,4};
        HashSet s=new HashSet<>();
        for(int i=0;i< arr.length;i++)
        {
            s.add(arr[i]);
        }
        System.out.println(s.size());
    }
}
