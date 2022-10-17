package lovebabar_dsa;

import java.util.Scanner;

public class q5_negative_oneside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int ptr1=0,ptr2=n-1;
        while (ptr1<=ptr2)
        {
            if(arr[ptr1]<0)       // increasing ptr1 if arr[ptr1]<0 and decreasing ptr2 if ptr2>0
                ptr1++;
            else if(arr[ptr2]>0)
                ptr2--;
            else                        // swaping arr[ptr1] and arr[ptr2] and increasing ptr1 and decreasing ptr2
            {
                int temp=arr[ptr1];
                arr[ptr1]=arr[ptr2];
                arr[ptr2]=temp;
                ptr1++;
                ptr2--;
            }
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

    }
}
