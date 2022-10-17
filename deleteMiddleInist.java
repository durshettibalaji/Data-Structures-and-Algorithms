public class deleteMiddleInist {
    public static void main(String[] args) {
        deleteMiddleInist li=new deleteMiddleInist();
        li.insert(1);
//        li.insert(2)
        li.print();
        li.mid();
        System.out.println();
        li.print();

    }

    Node1 head;
    void insert(int val)
    {
        Node1 newNode=new Node1(val);
        if(head==null)
            head=newNode;
        else
        {
            newNode.next=head;
            head=newNode;
        }
//        System.out.println(newNode.val);

    }
    void print()
    {
        Node1 temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
  Node1  mid()
    {
        if(head.next==null || head==null)
        {
            head=null;
            return null;
        }
        Node1 fast=head;
        Node1 slow=head;
        while (fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }


}
class Node1
{
    Node1 next;
    int val;
    Node1(int val)
    {
        this.val=val;
        this.next=null;
    }
}