import java.util.*;

class gcd_lcm
{

        public static void main(String[] args) {
            // write your code here
            Scanner input=new Scanner(System.in);
            int a=input.nextInt();
            int b=input.nextInt();
            int k=a;
            int l=b;
            if(a<b)
            {
                int temp=a;
                a=b;
                b=temp;
            }
            int r=b;
            while(r!=0)
            {
                r=a%b;
                a=b;
                b=r;
            }
            int gcd=a;
            int lcm=(k*l)/gcd;
            System.out.println("gcd is : "+gcd);
            System.out.println("lcm is : "+lcm);
        }
    }