package kunal;

import java.util.Scanner;

public class fibbonacci {
    public static void main(String[] args) {
        System.out.println("hey we shall find the fibbonacci sires of an number");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int f=1;
        int s=1;
        int t=0;
        System.out.print(f+" "+s+" ");
        for(int i=3;i<=n;i++)
        {
            t=f+s;
            System.out.print(t+" ");
            f=s;
            s=t;
        }
    }
}
