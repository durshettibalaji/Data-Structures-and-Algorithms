package appna_college;

import java.util.Scanner;

public class half_pyramid_with_space_frist {
    public static void main(String [] args)
    {
        System.out.print("enter n");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=a-i;j>=1;j--)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}


