import java.util.Scanner;

public class time_required {
    public static void main(String[] args) {
        long s1=System.currentTimeMillis();
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                if(i==0 || i==a-1 || j==0 || j==b-1)
                    System.out.print("* ");
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
long s2=System.currentTimeMillis();
        System.out.println("\n==========================================\n"+ (s2-s1)/Math.pow(10,6));
    }
}
