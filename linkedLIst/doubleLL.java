package linkedLIst;

public class doubleLL {
    node head;
    int size;
   static class node {
       node pre;
       int val;
       node next;

       node(int n) {
           val = n;
           pre = null;
           next = null;
       }
   }
        void insert(int n)
        {
            node Node=new node(n);
            node temp=head;
            if(head==null)
            {
             head=Node;
             size++;
            }
            else
            {
                while(temp.next!=null)
                {
                    temp=temp.next;
                }
                temp.next=Node;
                Node.pre=temp;
                size++;
            }
        }
        void insert(int i,int n)
        {
            node temp=head;
            node Node=new node(n);

            for(int k=0;k<i-1;k++)
            {
                temp=temp.next;
            }
            if(i==size)
            {
                temp.next=Node;
                Node.pre=temp;
                Node.next=null;
                size++;
            }
            else {
                Node.next = temp.next;
                temp.next.pre = Node;
                Node.pre = temp;
                temp.next = Node;
                size++;
            }
        }
        void show()
        {
            node temp=head;
            while(temp.next!=null)
            {
                System.out.print(temp.val+" ");
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
            head.pre=null;
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
            temp.next.pre=temp;
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
           // tail=temp;
            size--;
        }
    }
    }

