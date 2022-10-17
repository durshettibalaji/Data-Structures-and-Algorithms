public class midpoint {
    public static void main(String[] args) {
        midpoint md=new midpoint();
        md.push(1);
        md.push(2);
        md.push(3);
        md.push(4);
        md.push(5);
//        md.print();
        md.deleteMid();
    }

    class node{
        int val;
        node next;
        node(int val)
        {
            this.val=val;
            this.next=null;
        }
    }
    node head=null;
    void push(int val)
    {
        node newnode= new node(val);
        node temp=head;
        if(head==null)
        {
           head=newnode;
        }
        else {
            while (temp.next!= null) {
                temp = temp.next;
            }
            temp.next=newnode;
        }
    }
    void print()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    void deleteMid()
    {
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.val);
    }
}
