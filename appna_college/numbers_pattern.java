package appna_college;

import java.util.Scanner;

public class numbers_pattern {
    public static void main(String [] args)
    {
        int c=0;
        System.out.print("enter n");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                c++;
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
