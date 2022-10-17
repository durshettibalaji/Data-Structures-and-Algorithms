package collections.TreeSet;

import java.util.TreeSet;

public class constructors {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
//        ts.add(null); null pointer exception
        ts.add(9);
        ts.add(4);
        ts.add(5);
        ts.add(15);
//        ts.add('a');  error(class cast exeception)
//        ts.add(null);   null pointer exception
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts);
    }
}
