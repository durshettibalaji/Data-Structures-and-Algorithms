package striver;

import java.util.Scanner;

public class stock_buy_and_cell {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println(buy_and_sell(arr));

    }
    static int buy_and_sell(int[] arr)
    {
        int low=Integer.MAX_VALUE;
        int max=0;
        int profit=0;
        for(int i=0;i<arr.length;i++)
        {
            low=Math.min(low,arr[i]);
            profit=arr[i]-low;
            max=Math.max(profit,max);

        }
        return max;
    }
}
