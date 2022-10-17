import java.util.ArrayList;
import java.util.Scanner;

public class sameinarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            arr1.add(sc.nextInt());
        }
        for (int i = 0; i < b; i++) {
            arr2.add(sc.nextInt());
        }
        for (int i = 0; i < c; i++) {
            arr3.add(sc.nextInt());
        }
        for(int i=0;i<a;i++)
        {

            if(arr2.contains(arr1.get(i))  && arr3.contains(arr1.get(i)))
            {
                System.out.println(arr1.get(i));
            }

        }
    }
}