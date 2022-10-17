package appna_college;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print(k+" ");
            }
            for(int l=2;l<=i;l++)
            {
                System.out.print(l+" ");
            }
            System.out.println();
        }


    }


}
