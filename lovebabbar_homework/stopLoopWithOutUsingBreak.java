package lovebabbar_homework;

import java.util.Scanner;

public class stopLoopWithOutUsingBreak {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(1==1)
        {
            int num=sc.nextInt();
            switch (num)
            {
                case 1:
                    System.out.println(1+"\nif want get out press 0");
                    break;
                case 0:
                    System.out.println("need to go out");
                    System.exit(0);
                default:
                    System.out.println(num+"\nif want get out press 0");
                    break;
            }
        }
    }
}
