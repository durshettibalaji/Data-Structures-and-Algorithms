package appna_college;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
