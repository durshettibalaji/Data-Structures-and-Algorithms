package lovebabbar_homework;

import java.util.Scanner;

public class notes {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int ten=0,hunderad=0,fivehun=0,twothousand=0,ones=0;
        while(n!=0)
        {
            if(n>2000)
            {
                n=n-2000;
                twothousand++;
            }
            else if(n>500)
            {
                n=n-500;
                fivehun++;
            }
            else if(n>100)
            {
                n-=100;
                hunderad++;
            }
            else if(n>10)
            {
                n=n-10;
                ten++;
            }
            else {
                ones=n;
                n=0;
            }
        }
        System.out.println("no of 2000's is: "+twothousand+"\nno of 500's is: "+fivehun+"\nno of 100's is: "+hunderad+"\nno of 10's is: "
       +ten+"\nno of 1's is : "+ones );
    }
}
