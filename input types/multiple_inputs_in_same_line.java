import java.util.Scanner;

public class multiple_inputs_in_same_line {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a=input.nextInt();
        long b=input.nextLong();
        float c=input.nextFloat();
        double e=input.nextDouble();
        char f= input.next().charAt(0);
        System.out.println(a+"\n"+b);
    }
}
