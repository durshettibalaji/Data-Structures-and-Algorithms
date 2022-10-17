import java.util.ArrayList;
import java.util.Scanner;

public class super_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

    }
    public static void ab(ArrayList a)
    {
        boolean b=a.add(5);
        ab(a);
    }
}
