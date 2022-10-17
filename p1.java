import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n= sc.nextLong();
        long m= sc.nextLong();
        long x= sc.nextLong();
        long y= sc.nextLong();
        System.out.println(fun(n,m,x,y));

    }
    static long fun(long n,long m,long x,long y)
    {
        long p=m/x;
        long k=p;
        boolean a=false;
        while (a==false)
        {
            if(p>=n)
                return n;
            k=p;
            m=m+y;
            p=m/x;
            p--;
            if(k<=p)
                return p;
        }
        return  0;
    }
}
