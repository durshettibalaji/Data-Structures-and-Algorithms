package String;

public class string_pool {
    public static void main(String[] args) {
        String a="preeti";
        String b="Balaji";
        String c="preeti";
        String d=new String("balaji").intern();
        String e=new String("balaji");
//        System.out.println(d==e);
//        char[] arr={'a','b','c','d','e'};
//        String[] arr1={"balaji","srinivas","hakshmi","alekya"};
//        int[] arr2={1,2,3,4};
//        String abc=String.valueOf(arr2);
//        for(int i=0;i<abc.length();i++)
//        System.out.println(abc.charAt(1));

        String abcd="india is my country";
        String[] arr5=abcd.split(" ",3);
        for(String i:arr5)
            System.out.print(i+",");
    }
}
