package array;

import java.util.Scanner;

public class reversal_of_n_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int d= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
       arrayreverse arv=new array_reversal();
       arr=arv.method4(arr,n,d);
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }


//=================================================================================
//       method 1


    }

}
class array_reversal extends arrayreverse {
    int n;
    int d;
    int[] arr;

    array_reversal() {
    }
    public int[] method1(int[] arr, int n, int d) {
        return (methoda1(arr, n, d));
    }
    public int[] method2(int[] arr, int n, int d) { return (methoda2(arr, n, d)); }
    public int[] method3(int[] arr, int n, int d) { return (methoda3(arr, n, d)); }
    public int[] method4(int[] arr, int n, int d) { return (methoda4(arr, n, d)); }

    private int[] methoda1(int[] arr, int n, int d) {
        this.n = n;
        this.d = d;
        this.arr = arr;
        System.out.println("method 1: this method uses the extra array \n time complexity= O(n)\n space complexity =O(n)");
        int[] b = new int[d];
        for (int i = 0; i < d; i++) {
            b[i] = arr[i];
        }
        for (int i = 0; i < n - d; i++) {
            arr[i] = arr[i + d];
        }
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = b[i];
        }
        return arr;
    }

    private int[] methoda2(int[] arr, int n, int d) {
        System.out.println("method 2: this algorithm will tkae\n time complexity of O(n*d)\n space complexity of O(1)");
        int temp;
        for (int i = 0; i < d; i++)
        {
            temp = arr[0];
            for (int j = 1; j < n; j++) {
                arr[j-1] = arr[j];
            }
            arr[n - 1] = temp;
        }
        return arr;
    }
    private int[] methoda3(int[] arr, int n, int d) {
        System.out.println("in this method we take the gcd of n and b \ntime complexity is O(n) \n space complexity is O(1)");
        d = d % n;
        int gcd = gcd(n, d);
        int i, j, k, temp;
        for ( i = 0; i < gcd; i++) {
            temp = arr[i];
            j = i;

            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;

            }
            arr[j] = temp;

            for(int l=0;l<n;l++)
            {
                System.out.print(arr[l]+" ");
            }
            System.out.println();

        }
        return arr;
    }
   private  int[] methoda4(int[] arr, int n, int d)
    {
        System.out.println("method 4\ntime complexity :O(n)\n space complexity :O(1)");
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        return arr;
    }
    int[] reverse(int[] arr,int s,int e)
    {
        int temp;
        while(s<e)
        {
            temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        return arr;
    }


   private  int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

}
abstract class arrayreverse {

    abstract int[] method1(int[] arr,int n,int d);
    abstract int[] method2(int[] arr,int n,int d);
    abstract int[] method3(int[] arr,int n,int d);
    abstract int[] method4(int[] arr,int n,int d);
}

