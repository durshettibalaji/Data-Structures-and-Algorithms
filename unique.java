import java.util.HashSet;
import java.util.Scanner;

public class unique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] str1=str.split(" ");
        HashSet <String> set=new HashSet<>();
        for(int i=0;i<str1.length;i++)
        {
            if(set.contains(str1[i]))
            {
                set.remove(str1[i]);
            }
            else
            {
                set.add(str1[i]);
            }

        }
        System.out.println(set);
    }
}
