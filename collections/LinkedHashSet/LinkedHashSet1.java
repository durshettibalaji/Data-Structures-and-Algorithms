package collections.LinkedHashSet;
import java.util.*;
//  same as hashset but order is stored
public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add(1);
        lhs.add(2);
        lhs.add(4);
        lhs.add(2);
        lhs.add(1);
        System.out.println(lhs.toString());

    }
}
