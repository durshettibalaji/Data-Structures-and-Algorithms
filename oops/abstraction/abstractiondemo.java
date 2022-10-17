package oops.abstraction;
abstract class geometry
{
 abstract public void area(int a,int b);
 abstract public void perimeter(int a,int b);
 public void balaji()
 {
     System.out.println("parent");
 }
}
class square extends geometry
{
    public void balaji()
    {
        System.out.println("child");
    }
    @Override
    public void area(int a,int b)
    {
        //return a*b;
    }
 @Override
        public void perimeter(int a,int b)
        {

        }
        }
class rectangel extends geometry
{
    @Override
    public void area(int a,int b)
    {
        //return a*b;
    }
    @Override
    public void perimeter(int a,int b)
    {
        //return 2*(a+b);
    }
}

public class abstractiondemo {
    public static void main(String[] args) {
        geometry balaji = new square();
        balaji.perimeter(1,2);
        balaji.balaji();
       // geometry balu =new geometry()
    }
}