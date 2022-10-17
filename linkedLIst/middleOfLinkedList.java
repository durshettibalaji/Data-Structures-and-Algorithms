package linkedLIst;

public class middleOfLinkedList {
    public static void main(String[] args) {
        middle mid=new middle();
        mid.insert(1);
        mid.insert(2);
        mid.insert(3);
        mid.insert(4);
        mid.insert(5);
        mid.insert(6);
        mid.midele();
    }

}
class middle {
    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    node head=null;
    void insert(int data)
    {
        node newNode=new node(data);
        node temp=head;
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }

    }
    void delete()
    {
        node temp=head;
        if(head==null)
        {
            System.out.println("deletion not possible");
        }

        else
        {
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }
    void print()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    void midele()
    {
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow.data);
    }

}