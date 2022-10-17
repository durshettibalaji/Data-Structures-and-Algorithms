package oops.inheritance;

public class protected_class extends abcd {
    public static void main(String[] args) {
        abcd ab=new abcd();
        System.out.println(ab.abc(45));
    }
}
//protected class balaji         class can not be protected class or interface can be only public or default
class abcd
{
    int i;
int abc(int a)
{
     this.i=a;
    return i;
}
}
class man  {
    abcd a = new abcd();
public int ab()
    {
        return a.abc(22);
    }
}
