package linkedLIst;

public class linkedlist1 {
    node head;
    int size;
    static class node {
        int val;
        node next;

        node(int n) {
            this.val = n;
            this.next = null;
        }
    }
   public void insert(int n)
    {
        node Node= new node(n);
        if(head==null)
        {
            head=Node;
        }
        else
        {
            node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=Node;
        }
        size++;
    }
    public void show() {
        if (head == null)
            System.out.println("empty");
        else {
            node temp = head;
            while (temp.next != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println(temp.val);
        }
    }
    public void insert(int i,int n)
    {
       node Node=new node(n);
        int k=0;
        node temp=head;
         if(i==0)
        {
            Node.next=head;
            head=Node;
            size++;
        }
         else if(i>size)
             System.out.println("not possible");
        else if(i<=size)
        {
            while(k<i-1 && temp.next!=null)
            {
                temp=temp.next;
                k++;
            }
            Node.next=temp.next;
            temp.next=Node;
            size++;
        }
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
        }
        else if(i<=size)
        {
            while(k<i-1 && temp.next!=null)
            {
                temp=temp.next;
                k++;
            }
            temp.next=temp.next.next;
            size--;
        }
    }

    public static void main(String[] args) {
        node head = new node(1);
        head.next=new node(2);
        System.out.println(head.val);
    }
}