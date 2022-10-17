package kunal.oops;

final class Student1
{
    final  String name="balaji";
     int roll=65;
}

public class final_keyword {
    public static void main(String[] args) {
        final int a = 20; //we can not change the variable if we instalized with final
       // a=30; if we try to change we will get the error
        Student1 b=new Student1();
      //  b.name="balaji";  //we assingn to final variable
        b.roll=45;
        Student1 c=new Student1();
        c.roll=45;
        System.out.println(b.name);
        // b=new Student1();  //we can not assign the new object to the final oject it will give error
        // b=a;



    }
}

