import java.util.Scanner;

public class subarraysum0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int k=0;
        for(int i=0;i<n;i++)
        {
            sum=0;
            for(int j=i+1;j<n;j++)
            {
                sum+=arr[j];
                if(sum==0) {
                    System.out.println("Yes");
                    k=1;
                }
            }

        }
        if(k==0)
        {
            System.out.println("No");
        }
    }
}
