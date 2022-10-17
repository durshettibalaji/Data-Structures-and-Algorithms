class outer
{
    int x=5;
    int y=4;
   static class inner
    {
        int a=10;
        int b=11;
       static int sum()
        {
            return 5;
        }
    }

}
public class NestedClass {
    public static void main(String[] args) {
        outer out=new outer();
        outer.inner in= new outer.inner();
        System.out.println(in.sum());
    }

}
