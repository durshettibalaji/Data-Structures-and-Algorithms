import java.util.Scanner;

public class negative_number_to_binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int b=decimal_to_binary.dtb(n);
        int k=b;
        int i=0;
        int c=0;
        while(b!=0)
        {
            c=c*10+1;
            i++;
            b=b/10;
        }
        System.out.println(7^1);
    }
}
