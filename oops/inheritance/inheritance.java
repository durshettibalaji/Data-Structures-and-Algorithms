package kunal.oops;

class shape
{
    int l;
    int b;
    int x=10;
    shape(int l,int b)
    {

        this.l=l;
        this.b=b;
    }
    shape()
    {
        this.l=10;
        this.b=15;
    }
    shape (int l)
    {
        this.l=l;
        this.b=l;
    }
    static  void msg()
    {
        System.out.println("i am in stattic method and parent class this shows static methods can be inherited");
    }
}
class vol extends shape
{
    int height;
    int volume;
    //int x=20;
    vol(int l, int b,int h) {
        super(l, b);//calling parent call constructor

        this.height=h;
        this.volume=l*h*b;
    }
    vol(int l)
    {
        super();
        this.volume=l*b*l;

    }

    void print()
    {
        System.out.println("this.x :"+this.x);   // vaule prasent in the child class if variable not present it will check in parent class
        System.out.println("super.x :"+super.x); //checks in the parent class
    }
}

public class inheritance {
    public static void main(String[] args) {
        vol square=new vol(5,10,20);
        System.out.println(square.volume);
        shape a=new shape();
        square.print();
        square.msg();
    }
}
