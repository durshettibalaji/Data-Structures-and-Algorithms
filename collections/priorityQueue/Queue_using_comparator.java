// Java code to illustrate the use of comparator()

import java.util.Comparator;
import java.util.PriorityQueue;

class The_Comparator implements Comparator<Integer> {
    public int compare(Integer a,Integer b)
    {
     if(a%100<b%100)
         return 1;
        return -1;
    }
}

public class Queue_using_comparator{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> queue = new
                PriorityQueue<Integer>(new The_Comparator());

        queue.add(109);
        queue.add(208);
        queue.add(505);
        queue.add(306);
        queue.add(802);
        queue.add(604);


        System.out.println("The elements with the highest priority element at front of queue"
                + "order:");
        while(!queue.isEmpty()){
            System.out.print(" "+queue.poll());
        }
    }
}
