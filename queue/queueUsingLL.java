package queue;

public class queueUsingLL {
    node front;
    node rare;
    node head;
    static  class node
    {
        int val;
        node next;
        node(int n)
        {
            this.val=n;
        }
    }
    void enqueue(int n)
    {
        node temp=new node(n);
        node k=head;
        if(head==null)
        {
            head=temp;
            front=temp;
            rare=temp;
            return;
        }
        else
        {
            rare.next=temp;
            rare=temp;
        }
    }
    int  dequeue()
    {
        if(front==null)
        {
            System.out.println("empty queue");
            return -1;
        }
        else
        {
            int k= front.val;
            front=front.next;
            return k;
        }
    }
    void print()
    {
        node temp=front;
        while (temp!=null )
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }

}
