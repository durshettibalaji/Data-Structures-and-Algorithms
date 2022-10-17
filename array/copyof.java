package array;

import java.util.Arrays;
import java.util.Scanner;

public class copyof {
    public static void main(String[] args) {

        int a[] = new int[5];
        int[] b = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");
        b= Arrays.copyOf(a,10);
        System.out.println("size of the b array is 10");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }

    }
}