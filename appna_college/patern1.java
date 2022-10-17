package appna_college;

import java.util.Scanner;

public class patern1 {
    public static void main(String[] args) {
        System.out.print("enter dimension (length and breadth)");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
