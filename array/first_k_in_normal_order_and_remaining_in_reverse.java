package array;

import java.util.Arrays;

public class first_k_in_normal_order_and_remaining_in_reverse {
    public static void main(String[] args) {
        int[] arr={5,3,2,7,9,1,12,13};
        int k=3;
        int[] arr1=new int[k];
        Integer[] arr2=new Integer[arr.length-k];
        for(int i=0;i<k;i++)
            arr1[i]=arr[i];
        for(int i=k,j=0;i<arr.length;i++,j++)
            arr2[j]=arr[i];
        Arrays.sort(arr1);
        Arrays.sort(arr2 ,(a,b)->b-a);
        for(int i=0;i<k;i++)
            arr[i]=arr1[i];
        for(int i=k,j=0;i<arr.length;i++,j++)
            arr[i]=arr2[j];
        for(Integer i:arr)
            System.out.print(i+" ");
    }
}
