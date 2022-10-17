package recursion;

public class factorial {
    public static void main(String[] args) {
        int n=9;
        System.out.println(fact(n));
    }
    static int fact(int n){
        int k=0;
        if(n==1)
            return 1;
        else
        {
            k=n*fact(n-1);
            System.out.println(k);
            return k;
        }
    }
}
