import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



//import java.util.Scanner;
public class inputs
{
    public static void main(String[] args) {
        System.out.print("enter the rollnumber");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        System.out.println("hey your rollnum is "+a);
        List<Integer> b=new LinkedList<>();
        b.add(24);
        b.add(23);

        System.out.println(b.contains(12));



    }
}
