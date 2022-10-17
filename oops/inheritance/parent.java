package inheritance;

public class parent {
    public int x=10;
    public int y=20;
    parent()
    {
        System.out.println("i am in parent class");

    }

}
class child extends parent
{
    int k=20;
    int l=30;
    int z;
    child()
    {
        System.out.println("i am in child class ");
        z=k+l;
    }

}
class test
{
    public static void main(String[] args) {
        child ch = new child();
       parent p= ch;
        System.out.println(p.x);//we can only access the variables in the parent class but not child class
    }
}

