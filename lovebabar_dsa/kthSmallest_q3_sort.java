package lovebabar_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class kthSmallest_q3_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();    //taking input size of array
        int k= sc.nextInt();   //taking k
        int arr[]=new int[n];   //declearing and intialsing the array
        for(int i=0;i<n;i++)        //taking input to the array
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);  // sorting array
        System.out.println(arr[k-1]);

    }
}
