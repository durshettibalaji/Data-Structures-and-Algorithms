package collections.HashSet;

import java.util.HashSet;

public class IntersectionOfElement {
    public static void main(String[] args) {
        HashSet s = new HashSet();
        HashSet s1 = new HashSet();
        int[] arr1 = {1, 2, 3, 4, 5, 6, 9};
        int[] arr2 = {3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr1.length; i++) {
            s.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (s.contains(arr2[i])) {
                s1.add(arr2[i]);
                s.remove(arr2[i]);
            }
        }
        System.out.println(s1);
///           .........@@@@@@@@@@@@@@@@@..................
//.......................other method......................
        HashSet<Integer> s2=new HashSet<>();
        s2.add(1);
        s2.add(2);
        s2.add(3);
        HashSet<Integer> s3=new HashSet<>();
        s3.add(2);
        s3.add(3);
        s3.add(4);
        s3.add(5);
        s2.retainAll(s3);
        System.out.println(s2);
    }
}