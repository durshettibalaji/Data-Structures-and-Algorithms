package linkedLIst;

public class reverseDOublelinkedlist {
    static Node1 head;

    public static void main(String[] args) {
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        print(head);
        System.out.println();
        head=reverseitr(head);
        print(head);
        Node1 temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        System.out.println();
        printrev(temp);

    }

    public static void insert(int data) {
        Node1 newNode = new Node1(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.pre = newNode;
            head = newNode;
        }
    }

    public static void print(Node1 head) {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public  static  void printrev(Node1 head)
    {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.pre;
        }
    }

    public static Node1 reverserec(Node1 head) {

        if (head.next == null) {
            return head;
        }
        Node1 nexthaed = reverserec(head.next);
        head.next.next = head;
        head.pre=head.next;
        head.next = null;
        nexthaed.pre=null;
        return nexthaed;
    }

    public  static  Node1 reverseitr(Node1 head)
    {
        Node1 cur=head;
        Node1 next=cur.next;
        Node1 pre=null;
        while (cur!=null)
        {
            next=cur.next;
            cur.next=pre;
            cur.pre=null;
            if(pre!=null)
            pre.pre=cur;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
class Node1{
    Node1 next;
    Node1 pre;
    int data;
    Node1(int data)
    {
        this.data=data;
        this.next=null;
        this.pre=null;
    }
}