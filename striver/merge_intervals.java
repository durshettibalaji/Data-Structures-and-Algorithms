package striver;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*                           input=[[2,3][5,8]]
                             output =[[2,3][5,8]]


 */
public class merge_intervals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        int[][] arr1= merge(arr);
//        System.out.println(merge(arr).length);
        System.out.println("===========================================  main  ================================================");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] merge(int[][] arr) {
        if (arr.length <= 1)
            return arr;
        Arrays.sort(arr, (a1, a2) -> Integer.compare(a1[0], a2[0]));
        List<int[]> list = new ArrayList<>();
        int[] ci = arr[0];
        list.add(ci);
        int[][] a=list.toArray(new int[list.size()][]);
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("================================ iteration =====================================");
        for (int[] i : arr) {
            int cb = ci[0];
            int ce = ci[1];
            int nb = i[0];
            int ne = i[1];
            if (ce >= nb) {
                ci[1] = Math.max(ce, ne);
            } else {
                ci = i;
                list.add(ci);
            }
             a = list.toArray(new int[list.size()][]);
            for (int k = 0; k < a.length; k++) {
                for (int j = 0; j < a[k].length; j++) {
                    System.out.print(a[k][j] + " ");
                }
                System.out.println();
            }
            System.out.println("=================================================================================");
        }

        // System.out.println(list);
        return list.toArray(new int[list.size()][]);
    }
}
