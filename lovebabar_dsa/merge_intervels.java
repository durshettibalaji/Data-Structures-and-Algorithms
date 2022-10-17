package lovebabar_dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class merge_intervels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
       int k= merge(arr).length;
//        System.out.println(merge(arr).length);
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
   static int[][] merge(int[][] arr)
    {
        if(arr.length <= 1)
            return arr;
        Arrays.sort(arr,(a1,a2)->Integer.compare(a1[0],a2[0]));
        List<int[]> list=new ArrayList<>();
        int[] ci=arr[0];
        list.add(ci);
        for(int[] i:arr)
        {
            int cb=ci[0];
            int ce=ci[1];
            int nb=i[0];
            int ne=i[1];
            if(ce>=nb)
            {
                ci[1]=Math.max(ce,ne);
            }
            else
            {
                ci=i;
                list.add(ci);
            }
        }

        // System.out.println(list);
        return list.toArray(new int[list.size()][]);
    }
}
