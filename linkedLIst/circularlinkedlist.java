package linkedLIst;

public class circularlinkedlist {
    node head, tail;
    int size=0;

    static class node {
        int val;
        node next;

        node(int n) {
            val = n;
            this.next = null;

        }
    }

    circularlinkedlist() {
        head = null;
        tail = null;
    }
    void insert(int i)
    {
        node temp=new node(i);
        if (head == null && tail == null) {
            head=temp;
            tail=temp;
            tail.next=head;
            size++;
        }
        else {
            temp.next = head;
            tail.next = temp;
            tail=temp;
            size++;
        }
    }

    void insert(int i, int n) {
        node temp = new node(n);
        node k=head;
        if (head == null && tail == null) {
             head=temp;
             tail=temp;
             tail.next=head;
            size++;
        }
        else if (i == 0) {
            temp.next=head;
            head=temp;
            tail.next=head;
            System.out.println("B");
            size++;
        }
        else{
            for(int j=0;j<i-1;j++)
            {
                k=k.next;
            }
            temp.next=k.next;
            k.next=temp;
            if(size==i)
            {
                tail=temp;
            }
            size++;
        }
    }
    void show()
    {
        node temp=head;
        while(temp.next!=head)
        {
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println(temp.val);
    }
    public void deletion(int i )
    {
        node temp=head;
        int k=0;
        if(i>=size || size==0)
            System.out.println("not possible");
        else if(i==0)
        {
            head=head.next;
            tail.next=head;
            size--;
        }
        else if(i<size-1)
        {
            while(k<i-1 && temp.next!=head)
            {
                temp=temp.next;
                k++;
            }
            temp.next=temp.next.next;
            size--;
        }
        else
        {
            while(k<i-1 && temp.next!=head)
            {
                temp=temp.next;
                k++;
            }
            temp.next=temp.next.next;
            tail=temp;
            size--;
        }
    }
}

