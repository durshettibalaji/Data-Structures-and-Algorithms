package oops.polymorphism;

class shapes
{
    int a=10;
    int b=20;

void area(int a)
{
    System.out.println("i am in shapes");
    int c=this.a+this.b;
    System.out.println(c);
}
static  void msg()
{
    System.out.println("i am in static method of parent class");
}
}
class  triangel extends shapes
{
    int a;
   // @Override
    void area(int a)
    {
       this.a=a;
        System.out.println("i am in triangle  "+a);
    }
    static void msg()
    {
        System.out.println("i am in static method child class");
    }
}
class square extends shapes
{
    void area()
    {
        System.out.println("i am in square");
    }
}
class rectangle extends shapes
{
    //@Override
    void area()
    {
        System.out.println("i am in rectangle");
    }
}
public class polymorpism {
    public static void main(String[] args) {
//        System.out.println("polymorhism reprasenting same thing in multiple ways");
//        shapes s=new triangel();
//        s.area(25);
//        s.msg();// we get content in the msg method of parent class

    }
}
