package String;

public class reverse_String {
    public static void main(String[] args) {
        String str="man vs wild";
//        calling iterative approch
//        itr(str);


//calling recusive approch
        String s="";
        rec(str,str.length()-1,s);


    }
    public  static  void  itr(String s)
    {
        String a="";
        for(int j=s.length()-1;j>=0;j--)
        {
            a=a+s.charAt(j);
        }
        System.out.println(a);
    }

    public static  void rec(String str,int i,String s)
    {
        if(i<0) {
            System.out.println(s);
            return;
        }
        s+=str.charAt(i);
         rec(str,i-1,s);
    }

}
