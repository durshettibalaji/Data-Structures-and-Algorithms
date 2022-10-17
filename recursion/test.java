package recursion;

public class test {
    public static void main(String[] args) {
        test t=new test();
        int i=10;
        while (i-->0)
        {
            System.out.println(i);
        }
//        t.recursion(10);
    }
    int recursion(int n)
    {
        if(n==0)
            return 0;
//        System.out.println(n);
        int k= recursion(n-1);
        System.out.println(n);
        return k;
    }
}
