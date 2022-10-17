package codestudio.arrays;

import java.util.Scanner;

public class maximum_sum_subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println(maxsum(arr,n));
    }
    static  int maxsum(int[] arr,int n)
    {
        int max=0;
        int cur=0;
        for(int i=0;i<n;i++)
        {
            cur=cur+arr[i];
            if(cur<0)
            {
                cur=0;
            }
            max=Math.max(max,cur);
        }
        return max;
    }
}
