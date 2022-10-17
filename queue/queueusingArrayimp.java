package queue;

public class queueusingArrayimp {
    public static void main(String[] args) {
        queueUsingArray que=new queueUsingArray(3);
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        que.enqueue(4);
        que.enqueue(5);
     //   que.dequeue();
        que.getfront();
        que.print();

      //  que.enqueue(3);

    }
}
