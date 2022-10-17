package kunal.oops;
class nam
{
    static String name;
    int age;
    nam(String name)
    {
        nam.name=name;
    }
}
class human1
{
    String name;
    int  age;
    static int no_of_humans;
    int nth_human =0;
   // nth_human +=1;
    human1(String name,int age)
    {
        System.out.println("object has been creating with name "+name);
        this.name=name;
        this.age=age;
        human1.no_of_humans+=1;  //this.no_of_humans also work but it is better to use class name.variable
        nth_human =no_of_humans;

    }
    void msg()
    {
        System.out.println("i can only accessed by the object reference only in static method");
    }
    void aaa()
    {
        System.out.println("i am there in one nethod but you can also call from other non static method" +
                "\n"+"and also to call that non static method you required object to call in static method");
    }
    void fun_in_other()
    {
        aaa();
    }
}
public class static_in_class {
    public static void main(String[] args) {
        human1 a=new human1("balaji",22);
        human1 b=new human1("chinnu",23);
        human1 c=new human1("ajay",21);
        System.out.println(a.name+" "+a.no_of_humans+" "+a.nth_human);
        System.out.println(b.name+" "+b.no_of_humans+" "+b.nth_human);
        System.out.println(c.name+" "+c.no_of_humans+" "+c.nth_human);
       // msg(); //we can not call non static things in the static method
        //human1.msg() //by ths way also we can not access
        b.fun_in_other();
        nam ab=new nam("balaji nam");
        nam ba=new nam("raju nam");
        System.out.println(ab.name);  // if we class ab.name but we get raju nam as it is static and store in stack
    }

}
