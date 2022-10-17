import java.util.Scanner;

public class c1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int k=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            int l=0;
            for(int j=0;j<m;j++)
            {

                if(i-1<0 || i+1>=n || j-1<0 || j+1>=m )
                {
                    continue;
                }
                if(arr[i-1][j]==1)
               {
                   c++;
               }
               else
                   continue;
               if( arr[i+1][j]==1)
               {
                   c++;
               }
               else
                   continue;
                if( arr[j-1][i]==1)
                {
                    c++;
                }
                else
                    continue;
                if(arr[j+1][i]==1)
                {
                    c++;
                }
                else
                    continue;
                l=j;

            }
            if(c==4)
            {
                k++;
             //   System.out.println(i+" "+l);
            }
        }
        System.out.println(k);
    }
}
