import java.util.PriorityQueue;

public class kthsmallest {
    public static void main(String[] args) {
        int[] arr={7,9,3,4,16,90};

        int k=2;
        PriorityQueue<Integer> pqlow=new PriorityQueue<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>((a, b ) -> b - a )
                ;
        for(int i=0;i<arr.length;i++)
        {
            //every time O(logn)
            pq.add(arr[i]);
            pqlow.add(arr[i]);
        }
      //  O(nlogn)
        for(int i=0;i<k-1;i++)
        {
//            ever time O(logn)
            pq.remove();
            pqlow.remove();
        }
//        O(klogn)
        System.out.println("max : "+pq.poll());
        System.out.println("min : "+pqlow.poll());

    }
}
//total =O(nlogn)+O(klogn)+c