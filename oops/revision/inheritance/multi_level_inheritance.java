package oops.revision.inheritance;

public class multi_level_inheritance {
    public static void main(String[] args) {
//        grand_father s1=new son();
//        System.out.println(s1.a);
        child c1=new child();
        System.out.println(c1.a);
    }
}
  class grand_father{
  protected   int a=10;
    int b=20;
    grand_father()
    {
        System.out.println("i am the grandfather");
    }
}
class father extends grand_father{
    int c=30;
    int d=40;
    father()
    {
        System.out.println("i am the father");
    }
}
class son extends father{
    int e=50;
    int f=60;
    son()
    {
        System.out.println("i am the son");
    }

}