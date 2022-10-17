package appna_college;

import java.util.Scanner;

public class solid_rohbus {
    public static void main(String[] args) {
        System.out.print("enter n");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>=1;j--)
                System.out.print(" ");
            for(int j=0;j<n;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
