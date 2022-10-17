package collections.Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class methods_in_ArrayDequeue {
    public static void main(String[] args) {
        Deque aq=new ArrayDeque();
        aq.add(1);
        aq.add(2);
        aq.add(3);
        aq.add(4);
        aq.add(5);
        aq.addFirst(10);
        aq.addFirst(20);
        System.out.println(aq);
        aq.addLast(30);
        aq.addLast(40);
        System.out.println(aq);
        aq.removeFirst();
        aq.removeFirst();
        aq.removeLast();
        System.out.println(aq);
//        aq.remove();
        aq.remove(2);
        System.out.println(aq);
    }
}
