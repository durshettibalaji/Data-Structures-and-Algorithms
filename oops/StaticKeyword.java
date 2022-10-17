package oops;
class Class1
{
    int a=10;
    static int b=25;
   Class1(int a)
    {
        this.a=a;
    }


}
public class StaticKeyword {
    public static void main(String[] args) {
        Class1 obj=new Class1(12);
        Class1 obj1=new Class1(25);
        Class1 obj2=new Class1(32);
        Class1 obj3=new Class1(64);
        System.out.println(obj.a+ "      "+obj.b);
        System.out.println(obj1.a+ "      "+obj1.b);
        System.out.println(obj2.a+ "      "+obj2.b);
        System.out.println(obj3.a+ "      "+obj3.b);

    }
}
