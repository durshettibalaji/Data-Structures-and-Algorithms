package exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class checkedException {
    public static void main(String[] args) {
        int i,j,k=0;
        BufferedReader br=new BufferedReader(new  InputStreamReader(System.in));
        int a=0;
        try {
             a = Integer.parseInt(br.readLine());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println(a);
    }
}
