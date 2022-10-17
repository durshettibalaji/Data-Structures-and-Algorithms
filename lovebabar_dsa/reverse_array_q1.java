package lovebabar_dsa;

import java.util.Scanner;

public class reverse_array_q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();    //taking input size of array
        int arr[]=new int[n];   //declearing and intialsing the array
        for(int i=0;i<n;i++)        //taking input to the array
        {
            arr[i]=sc.nextInt();
        }
//        for(int i=0;i<n;i++)
//            System.out.print(arr[i]+" ");
        int l=0;           //to point elements from start
        int h=n-1;         // to point elements from last
        while(l<h)          // in while loop we are swaping the elements like frist element with last
        {                    //secnod  element with second last and so on till every element get swaped in case of even no of elements
            int temp=arr[l];  //in case of odd number of elements we wont swap it with any element bcz it is in middle it not effect
            arr[l]=arr[h];     //even if we did we should do it with same number
            arr[h]=temp;
            l++;
            h--;
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

    }
}
