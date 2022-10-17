package algorithms;

import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.print(i+"   ");
            for(int k=0;k<n;k++)
                System.out.print(arr[k]+" ");
            System.out.println();
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
