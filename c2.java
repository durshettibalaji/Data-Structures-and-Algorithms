import java.util.HashSet;
import java.util.Scanner;
//unique count string (Sahil and Niraj)
public class c2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        HashSet<Character>set=new HashSet<>();
        for(char c : s.toCharArray()){
            set.add(c);
        }
        System.out.print(set.size());
    }
}