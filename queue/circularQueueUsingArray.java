package queue;

public class circularQueueUsingArray {
    int[] a;
    int front=-1,raer=-1;
    int n,size=0;
    circularQueueUsingArray(int n)
    {
        this.n=n;
        a=new int[n];
    }
    void enqueue(int val)
    {
        if((raer+1)%n==front)
        {
            System.out.println("queue is full");
            return;
        }
        if(front==-1)
            front=0;
        raer=(raer+1)%n;
        a[raer]=val;
        System.out.println(val+" is added");
        size++;
    }
    void dequeue()
    {
        if(front==-1)
        {
            System.out.println("queue is empty");
            return;
        }
        int val=a[front];
        if(front==raer)
        {
            front=raer=-1;
        }
        else
        {
            front=(front+1)%n;
        }
        System.out.println(val+" is removed");
    }

}
