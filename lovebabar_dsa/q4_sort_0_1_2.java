package lovebabar_dsa;

import java.util.Scanner;

public class q4_sort_0_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    //taking input size of array
        int arr[] = new int[n];   //declearing and intialsing the array
        for (int i = 0; i < n; i++)        //taking input to the array
        {
            arr[i] = sc.nextInt();
        }
        int i=0,ptr1=0,ptr2=n-1;  // taking 2 pointers ptr1(start) and ptr2(end) and i used for traversing
        while(i<=ptr2)            //while will run till i<=ptr2
        {
            if(arr[i]==0)                 //if element equal to 0
                                         //swap the present element and start_pointer element
            {                          //will make last_pointer-1 and start_pointer+1
                int temp=arr[i];
                arr[i]=arr[ptr1];
                arr[ptr1]=temp;
                ptr1++;
                i++;
            }
            else if(arr[i]==1)          // element is equal to 1  then increse i and do ntg
                i++;
            else
            {                           // if element equal to 2   swap arr[i] and arr[ptr2] and decreament last pointer
                int temp=arr[i];
                arr[i]=arr[ptr2];
                arr[ptr2]=temp;
                ptr2--;
            }
        }
        for(int m=0;m<n;m++)
            System.out.print(arr[m]+" ");

    }

}
