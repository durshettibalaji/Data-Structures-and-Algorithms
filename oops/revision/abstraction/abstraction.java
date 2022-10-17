package oops.revision.abstraction;

public class abstraction {
    public static void main(String[] args) {
        abstracted abs=new child();
        System.out.println( abs.add(54,89));

    }
}
abstract class abstracted{
     abstract int abc();
     abstract int abc2();
     int add(int a,int b)
     {
         return a+b;
     }

}
class child extends abstracted{
   int  abc(){
        return 1+3;
    }
    int abc2()
    {
        return 4+5;
    }
    int add(int a,int b)
    {
        return 250;
    }

}
