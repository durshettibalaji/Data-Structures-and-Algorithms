package appna_college;

import java.util.Scanner;

public class print_table_of_number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i <=10; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }
    }
}