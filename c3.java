import java.util.Scanner;
import java.util.Arrays;
//greater and smaller ones
public class c3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for(int j=0;j<n;j++){
                a[j]=sc.nextInt();
            }
            Arrays.sort(a);
            for(int j=0;j<n;j++){
                if(a[j]>=k){
                    System.out.print(a[j]+" ");
                }
                else if(j==n-1){
                    System.out.print(-1);
                }
            }

            System.out.println();
            for(int j=0;j<n;j++){
                if(a[j]<k){
                    System.out.print(a[j]+" ");
                    c++;
                }
                else if(j==n-1 && c==0  ){
                    System.out.println(-1);
                }
            }
        }
    }
}