package algorithms;

import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
            for(int k=0;k<n;k++)
            {
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}