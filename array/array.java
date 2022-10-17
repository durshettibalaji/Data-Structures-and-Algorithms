package array;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        /*  array in java is the class */
        int a[] = {5, 3, 1, 2, 4};
        int[] b = new int[5];// memory is stored in heap
        int c[] = {1, 2, 3, 4}; //memory is stored in stack
        Arrays.parallelSort(a);
        print(a);
        System.out.println();
        Arrays.fill(a, 2);
        print(a);
        b[1]=0;
        System.out.println(b.length);
       b= Arrays.copyOfRange(a,1,4);
        System.out.println(Arrays.equals(b,b));
       print(b);
    }
    static void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
