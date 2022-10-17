package sortingandsearching;

import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 3, 2, 1, 4};
        for (int i = 1; i < 5; i++) {
            int key = arr[i];
            int j = i-1;
            while ((j>=0) && ( key<arr[j] )) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
            for(int k=0;k<arr.length;k++)
            System.out.print(arr[k]+" ");
            System.out.println();

        }
            for(int i=0;i<5;i++)
            System.out.println(arr[i]);
        }
    }

