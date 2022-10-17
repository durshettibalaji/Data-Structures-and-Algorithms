package recursion;

public class DecimalTobinay {
    public static void main(String[] args) {
        DecimalTobinay ds=new DecimalTobinay();
        String a=ds.rec(255);
//        String b=ds.rec(32);
        System.out.println("\n"+a+"\n");
    }
   String rec(int n)
    {
        String  str="";
        if(n==0)
        {
            str=str+"0";
            System.out.println(str+" "+n);
            return  str;
        }
        if(n==1)
        {
//            System.out.print(1);
            str=str+"1";
            System.out.println(str+" "+n);
            return str;
        }
      String str1=  rec(n/2);
//        System.out.print(n%2);
        str=str1+String.valueOf(n%2);
        System.out.println(str+" "+n);
        return str;
    }

}
