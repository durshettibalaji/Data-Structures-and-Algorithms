package collections.priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class methods_in_priorityQueue {
    public static void main(String[] args) {
        Queue pq=new PriorityQueue();
        pq.add(4);
        pq.add(2);
        pq.add(3);
        pq.remove();// removes the smallest one
        System.out.println(pq);
        PriorityQueue<Integer> pq1 = new PriorityQueue(pq);
        pq1.add(1);
        pq1.add(2);
        pq1.add(8);
        pq1.remove();
        System.out.println(pq1);
    }
}
