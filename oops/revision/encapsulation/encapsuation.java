package oops.revision.encapsulation;

public class encapsuation {
    public static void main(String[] args) {
        encap obj= new encap();
//        obj.add();            we can not access the private variable out side the class
        System.out.println("before change:-"+obj.geta());
        obj.seta(23);
        System.out.println("after change:-"+obj.geta());
        System.out.println(obj.getaddvalue(23,67));
    }
}
class encap{
    private int a=20;
    private int b=45;
    private int add(int a,int b)
    {
        return (a + b);
    }
   private int mul(int a,int b)
    {
        return a*b;
    }
    int geta(){
        return a;
    }
    void seta(int a) {
        this.a = a;
    }
    int getaddvalue(int a,int b)
    {
       return add(a,b);
    }
}
