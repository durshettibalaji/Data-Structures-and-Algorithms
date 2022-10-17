package kunal.oops;
class parent
{
    parent()
    {
        System.out.println("hay i am parent");
    }

}
class child1 extends parent
{
child1()
{
    System.out.println("hey my parent is parnt    from child1");
}
}
class  child2
{
    child2 ()
    {
        System.out.println("hey my parent is parent   from child2");
    }
}

public class hiraricial_inheritance {
    public static void main(String[] args) {
        System.out.println("hierarcial inheritance means two or more child classes having same parent class");
        child1 ab=new child1();
        child2 bc=new child2();
    }
}
