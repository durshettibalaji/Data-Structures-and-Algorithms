package oops.abstraction;

public class abstraction {
    public static void main(String[] args) {
      //  abc a=new abc();     we can not create object for the abstrat class
        abc a=new balaji();
        System.out.println(a.bal(45));
    }
}
class balaji extends abc
{
 int bal(int a)
 {
     return  0;
 }
}
abstract class abc
{
    abstract int bal(int a);   //abstract method can not have body
    void apple()
    {
        System.out.println("apple");
    }
}