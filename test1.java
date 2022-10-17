public class test1 {
    public static void main(String[] args) {
        long ans=999999992;
        long a=1000000000;
        long b=1000000000;
        long t=1000000000000000000l;
        int   d= Long.toString(ans).length();
        System.out.println((a*ans+d*b)<=t);
    }
}