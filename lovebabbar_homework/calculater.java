package lovebabbar_homework;

import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the frist number");
        int a= input.nextInt();
        System.out.println("enter the second number");
        int b= input.nextInt();
        System.out.println("enter the operator from(+,-,/,*)");
        char op=input.next().charAt(0);
        switch (op)
        {
            case '+':
                System.out.println(a+b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
        }
    }
}
