package striver;

import java.util.Scanner;

public class merge2SortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        sol(arr1,arr2,n1,n2);
        for(int i=0;i<n1;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n2;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
    static  void sol(int[] arr1,int[] arr2,int n1,int n2)
    {
        int i=0,k=0;
        for(i=0;i<n1;i++)
        {
            if(arr1[i]>arr2[0]) {
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
            }
            int  temp=arr2[0];

                for(k=1;k<n2 && arr2[k]<temp;k++){
                    arr2[k-1]=arr2[k];
                }
                arr2[k-1]=temp;
        }
    }
}
