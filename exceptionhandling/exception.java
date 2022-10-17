package exceptionhandling;

public class exception {
    public static void main(String[] args) {


        int a = 45, b = 0;
        try {
            int k = a / b;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("balaji");
    }
}
