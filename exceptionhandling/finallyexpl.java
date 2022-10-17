package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class finallyexpl {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        try {
            int a=Integer.parseInt(br.readLine());
            int b=Integer.parseInt(br.readLine());
            System.out.println(a+"\n"+b);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Bye Bye katham");
            br.close();
        }

    }
}

