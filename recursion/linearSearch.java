package recursion;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,1,8,9};
        int t=7;
        System.out.println(linear(arr,arr.length-1,t));
    }
    static int linear(int[] arr,int n,int t)
    {
        if(n<0)
            return -1;
        if(t==arr[n])
            return n;
        return linear(arr,n-1,t);
    }
}
