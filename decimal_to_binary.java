import java.util.*;

public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String bin=rec(n,"");
        String rbin=reverse(bin,bin.length()-1,"");
        System.out.println(rbin+" "+bin);
        System.out.println(rbin.equals(bin));
    }
    public static int dtb(int n){
        int sum=0;
        int i=0;
        while(n!=0)
        {
            int bit=n&1;
            sum=sum+bit*((int)Math.pow(10,i));
            i++;
            n=n>>1;
        }
        return sum;
    }

    public static String rec(int n,String s)
    {
//        System.out.println(s);
        if(n==0)
        return  s;
        s=s+String.valueOf(n%2);
        String ans=rec(n/2,s);

        return ans;
    }
    public  static  String reverse(String str,int n,String s)
    {
        if(n<0)
            return s;
        s+=str.charAt(n);
        return  reverse(str,n-1,s);
    }
}
