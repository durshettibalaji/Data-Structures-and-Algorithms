package kunal;

import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("select operator from +  -  *  /");
        char c =sc.next().trim().charAt(0);
        switch (c) {
            case '+' -> System.out.println(a + b);
            case '-' -> System.out.println(a - b);
            case '*' -> System.out.println(a * b);
            case '/' -> System.out.println(a / b);
        }
    }
}