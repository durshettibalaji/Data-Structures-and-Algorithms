package kunal;

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p= input.nextInt();
        int t= input.nextInt();
        int r= input.nextInt();
        int si=(p*t*r)/100;
        System.out.println(si);

    }
}