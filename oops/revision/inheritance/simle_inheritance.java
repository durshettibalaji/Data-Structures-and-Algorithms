package oops.revision.inheritance;

public class simle_inheritance {
    public static void main(String[] args) {
        child c1=new child();
        c1.display();
    }
}

class parent{
  protected   int a=20;
    int b=30;
    parent()
    {
        System.out.println("parent");
    }
    void display()
    {
        System.out.println(a+" "+b);
    }
}
class child extends parent{
    int c=40;
    int d=50;
    child()
    {
        System.out.println("child");
    }
    void display(){
        System.out.println(a+" "+b+" "+c+" "+d);
    }
}