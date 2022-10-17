import java.util.*;

// don't change the name of this class
// you can add inner classes if needed
class test{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=1000000000;
        long b=1000000000;
        long t=1000000000000000000l;
        long x=1,res=0;
        long i=0,j=1000000000;
        long y=1;
        while (i<=j) {
            y=0;
            long mid=(i+j)/2;
            x=mid;
            long k=x;
            int   d= Long.toString(x).length();
            if (((a * x) + (b*d))> t) {
               // System.out.println(((a * x) + (b*d)));
                j=mid-1;
                }
            if(((a * x) + (b*d))<= t)
            {
//                System.out.println(res);
                res=x;
                i=mid+1;
            }
        }
        System.out.println(res);
    }
}