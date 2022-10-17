package striver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascal_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        pasacal(n);
    }
    static List<List<Integer>> pasacal(int n) {
        List<List<Integer>> main = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> cur = new ArrayList<>();
            for (int j = 0; j <= n; j++) {
                if(j==0 || j==n)
                    cur.add(1);
                else
                    cur.add(pre.get(j)+pre.get(j+1));
            }
            pre=cur;
            main.add(pre);
        }
        System.out.println(main);
        return main;
    }
}
