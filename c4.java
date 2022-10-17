import java.util.Scanner;
//diagonal traversal
public class c4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();//rows
        int n = sc.nextInt();//columns
        int a[][] = new int[m][n];
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int r = 0; r < m; r++) {
            for (i = r, j = 0; j < n && i >= 0; i--, j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int c = 1; c < n; c++) {
            for (i = m - 1, j = c; j < n && i >= 0; i--, j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}