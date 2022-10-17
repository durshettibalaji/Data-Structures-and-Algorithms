package queue;

public class queueimplimenation {
    public static void main(String[] args) {
        queueUsingLL que = new queueUsingLL();
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);

        que.print();
        que.dequeue();
        System.out.println();
        que.print();
        System.out.println();
        que.dequeue();
        que.print();
       // System.out.println(que.front.val);
    }
}