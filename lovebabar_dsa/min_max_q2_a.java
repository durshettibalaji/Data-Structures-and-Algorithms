package lovebabar_dsa;

import java.util.Scanner;

public class min_max_q2_a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();    //taking input size of array
        int arr[]=new int[n];   //declearing and intialsing the array
        for(int i=0;i<n;i++)        //taking input to the array
        {
            arr[i]=sc.nextInt();
        }
        int min=arr[0],max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<min)          //checking for min
                min=arr[i];
            else if(arr[i]>max)      //checking for max
                max=arr[i];
        }
        System.out.println(min+"  "+max);

    }
}
//                    ***************************$$$$$$*******************
// time compexity O(n)
//  space complexity O(1)