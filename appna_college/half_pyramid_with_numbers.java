package appna_college;

import java.util.Scanner;

public class half_pyramid_with_numbers {
    public static void main(String [] args)
    {
        System.out.print("enter n");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
