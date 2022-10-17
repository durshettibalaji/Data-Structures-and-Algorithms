package recursion;

public class fibbonaci {
    public static void main(String[] args) {
        fibbonaci fib=new fibbonaci();
        System.out.println(fib.fibbonacci(8));

    }
    int fibbonacci(int n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int k=fibbonacci(n-1)+fibbonacci(n-2);
        return k;
    }
}
