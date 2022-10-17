import java.util.Scanner;

public class interview {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] piles=new int[n];
        for(int i=0;i<n;i++)
        {
            piles[i]=sc.nextInt();
        }
        int h= sc.nextInt();
        int high=0;
        int low=n;
        int mid=0;
        for(int i=0;i<n;i++)
        {
            if(high<piles[i])
                high=piles[i];
//            System.out.println(high);
        }
        while(low<=high)
        {

            mid=(low+high)/2;
//           System.out.println(mid);
            if(check(piles,h,mid)==true && check(piles,h,mid-1)==false ) {
                System.out.println(mid);
                break;
            }
            else if(check(piles,h,mid)==false)
            {
                low=mid+1;
            }
            else
                high=mid-1;
        }
        System.out.println(check(piles,30,3));
    }
  public static   boolean check(int[] arr,int h,int k)
    {
        int res=0;
        for(int i=0;i<arr.length;i++)
        {
            int a=(arr[i]/k);
            if(arr[i]%k==0)
                res+=(a);
            else
                res=res+((a+1));
        }

        if(h<res)
            return false;
        return true;
    }
}









  /*  There are n piles of oranges, the ith pile has piles[i] oranges. The guards have gone and will come back in h hours.

        Abby can decide her oranges-per-hour eating speed of k. Each hour, she chooses some pile of orange and eats k orange from that pile.
        If the pile has less than k oranges, she eats all of them instead and will not eat any morea oranges during this hour.

        She wants to finish eating all the oranges before the guards return.

        Return the minimum integer k such that she can eat all the oranges within h hours.

        Example 1:

        Input: piles = [3,6,7,11], h = 8

        Output: 4

        Example 2:

        Input: piles = [30,11,23,4,20], h = 5

        Output: 30

        Example 3:

        Input: piles = [30,11,23,4,20], h = 6

        Output: 23  */