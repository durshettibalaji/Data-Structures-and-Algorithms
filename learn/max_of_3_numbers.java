import java.util.Scanner;

public class max_of_3_numbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int max=(Math.max(Math.max(a,b),c));
        System.out.println(max);
    }

}
