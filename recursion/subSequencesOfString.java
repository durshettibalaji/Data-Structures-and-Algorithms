package recursion;

import java.util.ArrayList;
import java.util.List;

public class subSequencesOfString {
    public static void main(String[] args) {
        List<String> str=new ArrayList<>();
        String s="";
        String input="abc";
        rec(str,input,"");
        System.out.println(str);

    }
    static  void rec(List<String> str,String s,String ans)
    {
        if(s.length()==0)
        {
            str.add(ans);
            return;
        }
        rec(str, s.substring(1), ans + s.charAt(0));
        rec(str,s.substring(1),ans);
    }
}
