package array;

import java.util.Scanner;

public class kadane_agorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        int maxsum=0;
        int k=0;
        for(int i=0,j=0;j<n ;)
        {
            sum=sum+arr[j];
            if(sum<0)
                sum=0;
                while(sum>maxsum)
                {
                maxsum=Math.max(sum,maxsum);
                if(sum<sum-arr[i]) {
                    sum = sum - arr[i];
                    i++;
                }

            }
                j++;
        }
        System.out.println(maxsum);
    }
}
