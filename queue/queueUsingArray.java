package queue;

public class queueUsingArray {
    int[] a;
    int raer;
    int capacity;
    queueUsingArray(int n)
    {
        capacity=n;
        a=new int[n];
        raer=-1;
    }
    void enqueue(int n)
    {
        if(raer>=capacity-1)
        {
            System.out.println("queue is full");
        return;
        }
        raer++;
        a[raer]=n;
    }
    int dequeue()
    {
        if(raer==-1)
        {
            System.out.println("queue is empty");
            return -1;
        }
        int k=a[0];
        for(int i=0;i<raer;i++)
        {
            a[i]=a[i+1];
        }
        raer--;
        return k;
    }
    void getfront()
    {
        if(raer==-1)
        {
            System.out.println("empty queue");
            return;
        }
        System.out.println(a[0]);
    }
    void print()
    {
        for(int i=0;i<=raer;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
