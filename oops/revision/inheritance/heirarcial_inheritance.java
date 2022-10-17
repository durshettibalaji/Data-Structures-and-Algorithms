package oops.revision.inheritance;

public class heirarcial_inheritance {
    public static void main(String[] args) {
        child3 c1=new child3();
        child2 c2=new child2();
    }
}

class father1
{
    int a=20;
    int b=30;
    father1(){
        System.out.println("hey......! i am the father");
    }
}
class child2 extends father1
{
    int c=40;
    int d=50;
    child2()
    {
        System.out.println("hey...! i am the child 2");
    }

}
class child3 extends father1
{
    int e=60;
    int f=70;
    child3()
    {
        System.out.println("hey...! i am child 3");
    }
}
