package array;

import java.util.Scanner;

public class half_sorted_BS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int key=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int p=find_pivot(arr,0,n-1);
        if(arr[0]<=key)
            System.out.println(pos(arr,0,p,key));
        else
            System.out.println(pos(arr,p+1,n-1,key));
    }
  static   int find_pivot(int[] arr,int s,int e)
    {
        int mid=(s+e)/2;
        if(s==e)
            return s;
         if(mid>s && arr[mid]<arr[mid-1])
            return mid-1;
        if(mid<e && arr[mid]>arr[mid+1])
            return mid;
        if(arr[s]>=arr[mid])
            return (find_pivot(arr,s,mid-1));
        return(find_pivot(arr,mid+1,e));
    }
    static int pos(int[] arr,int s,int e,int k)
    {
        int mid=(s+e)/2;
        if(arr[mid]==k)
            return(mid);
        if(s>e)
            return -1;
        if(arr[mid]>k)
            return(pos(arr,s,mid-1,k));
            return (pos(arr,mid+1,e,k));
    }

}
