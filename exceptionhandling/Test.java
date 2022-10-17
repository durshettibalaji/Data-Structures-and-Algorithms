package exceptionhandling;
import java.util.*;
import java.io.*;




public class Test {
    public static void main(String args[])
    {

        try{
            methodA();

            System.out.println("Exit main()");

        }
        catch(InvalidException ex)
        {
            System.out.println("InvalidException caught ..." + ex.getMessage());

            ex.printStackTrace();
        }


    }

    static void methodC() {
        methodB();
    }
    static void methodB() {
        System.out.println("Enter methodB ---start()");
        // methodA();
        System.out.println("Enter methodB--- end()");
    }
    static void methodA() throws InvalidException
    {
        System.out.println("Enter methodA()");

        int a = 5, b = 0;

        if(b == 0 )
            throw new InvalidException("caught an Excption in our Test module !");
        int c = a / b;

        System.out.println(c);


        System.out.println("finally in methodA()");
    }


}
// custom exception class

class InvalidException extends Exception
{
    public InvalidException(String msg)
    {
        super(msg);
    }

}
