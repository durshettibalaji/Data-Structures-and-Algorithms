package oops.encapsulation;
class balaji
{
    private int a=123;
    private int b=224;
    int  ab()
    {
        System.out.println("i will return the value of a");
        return(a);

    }
    void bc(int data)
    {
//        System.out.format("a value %d is changing to %d\n",this.a);?
        this.a=data;
        System.out.println(a);

    }


}

public class encapsulation {
    public static void main(String[] args) {
        balaji ba = new balaji();
   //  ba.a=24;   //we can not use variable a as it is private
        System.out.println( ba.ab());
        ba.bc(25);

    }
}
