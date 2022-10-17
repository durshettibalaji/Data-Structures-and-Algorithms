package striver;

import java.util.Scanner;

public class countInversions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(mergeSort(arr,0,n-1));

    }
    static int mergeSort(int[] arr,int l,int h)
    {
        int c=0;
        if (l < h)
        {
            int mid = (l + h) / 2;
          c+=  mergeSort(arr,l,mid);
           c+= mergeSort(arr,mid+1,h);
           c+= merge(arr,l,mid,h);
        }
        return c;
    }
    static int merge(int[] arr,int l,int mid,int h)
    {
        int n1=mid-l+1;
        int n2=h-mid;
        int[] a=new int[n1];
        int[] b=new int[n2];
        for(int i=0;i<n1;i++)
        {
            a[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++)
        {
            b[i]=arr[mid+i+1];
        }
        int i=0,j=0,k=l;
        int c=0;
        while(i<n1 && j<n2)
        {
            if(a[i]<=b[j])
            {
               arr[k]=a[i];
               i++;
//               c+=n1-i;
            }
            else
            {
                arr[k]=b[j];
                j++;
                c+=n1-i;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k]=a[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=b[j];
            j++;
            k++;
        }
        return c;
    }
}
