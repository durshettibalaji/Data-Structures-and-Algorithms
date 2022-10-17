package array;

public class array2d {
    public static void main(String[] args) {
        int a[][]=new int[3][];
        int [][] b={{1,2,3,4},{5,6,7,8}};
        System.out.println(b[1][1]); //gives the row size
        for(int i=0;i<a.length;i++)
        {
            a[i]=new int[i+3];
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=i+j;
                System.out.print(b.length+" ");
            }
            System.out.println();
        }

    }
}
