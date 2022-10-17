public class ll1
{
    public static void main(String[] args) {
        linkist list=new linkist();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        System.out.println( list.findmid());
//        list.print();
    }
}

class linkist{
    Node head=null;
    static class Node
    {

        int val;
        Node next;
        Node(int val)
        {
            this.val=val;
        }
    }
    void insert(int n)
    {
        Node temp=new Node(n);
        if(head==null)
        {
            head=temp;
        }
        else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = temp;
        }
    }
    int findmid()
    {
        Node fast=head;
        Node slow=head;
        while (fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.val;
    }
    void print()
    {
        Node cur=head;
        while(cur.next!=null)
        {
            System.out.println(cur.val);
            cur=cur.next;
        }
        System.out.println(cur.val);
    }
}
