package kunal;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        for(int i=a;i<=b;i++)
        {
            int n=i;
            int sum=0;
            int r=0;
            while(n>0)
            {
                r=n%10;
                sum+=r*r*r;
                n=n/10;
            }
            if(sum==i)
            {
                System.out.println(i);
            }
        }
    }
}
