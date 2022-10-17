package oops.revision.inheritance;

public class parent_type_child_object {
    public static void main(String[] args) {
      parent1 c1= new child1();
      c1.display();


    }
}
class parent1{
    int a=20;
    int b=30;

    void display()
    {
        System.out.println(a+" "+b);
    }
}
class child1 extends parent1{
    int c=40;
    int d=50;

    void display(){
        System.out.println(a+" "+b+" "+c+" "+d);
    }
}