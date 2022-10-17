package striver;
import most_usefull_functions.swap;
import most_usefull_functions.reverse;

import java.util.Scanner;
/* if have the input as 123 we get output as 132
   1 5 3  o/p:- 3 1 5
   next bigger number with using that numbers
   5 3 1 o/p:- 1 3 5
 */

public class next_permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        method(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    static void method(int[] arr)
    {
        int i=arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1])
            i--;
        if(i>=0)
        {
            int j=arr.length-1;
            while(arr[j]<=arr[i])
                j--;
            swap.swap(arr,i,j);
        }
        reverse.reverse(arr,i+1, arr.length-1);
    }

}
