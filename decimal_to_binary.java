import java.util.*;

public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(dtb(n));
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
}
