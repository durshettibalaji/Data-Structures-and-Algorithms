package array;

import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(search(arr,0,n-1,key));
    }
    static int  search(int[] arr,int s,int e,int k)
    {
        int mid=(e+s)/2;
        if(arr[mid]==k)
            return mid;
        if(s>e)
            return -1;
        if(arr[mid]>k)
            return search(arr,s,mid-1,k);
        return search(arr,mid+1,e,k);
    }
}
