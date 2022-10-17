package oops.revision.interface1;

public class interface1 {
    public static void main(String[] args) {

        callinterface it = new callinterface();
        System.out.println(it.method1());
        it.method1();
    }
}

interface interfaceExmpl1
{
    int method1();
    int method2();
}
interface  interfaceExmpl2
{
    int method1();
    int method2();
}
class callinterface implements interfaceExmpl1,interfaceExmpl2{
    public int method1()
    {
        return 200;
    }
    public int method2()
    {
        return 400;
    }
}