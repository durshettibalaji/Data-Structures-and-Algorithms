package kunal.oops;
class a
{
    int x;
    int y;
    a()
    {
        System.out.println("class a object created");
        this.x=10;
        this.y=20;

    }
}
class b extends  a
{
    int k=30;
    int l=40;
    b()
    {
        System.out.println("class b object created");
    }
}
class c extends b
{
    int g=50;
    int h=60;
    c()
    {
        System.out.println("class c object created");
    }
}

public class multilevel_inheritance
{
    public static void main(String[] args) {
    c ac=new c();
    b ab=ac;
        System.out.println(ab.l);
}
}
