package exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tryexmpl {
    public static void main(String[] args) throws Exception {
        int k=0;
        if(k<10)
        {
            throw  new ArithmeticException();
        }
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
        {
            int a=Integer.parseInt(br.readLine());
            System.out.println(a);
        }
    }
}
