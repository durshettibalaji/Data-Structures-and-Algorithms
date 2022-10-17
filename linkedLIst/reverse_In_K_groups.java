package linkedLIst;

public class reverse_In_K_groups {
    public static void main(String[] args) {
        linkedlist2 list=new linkedlist2();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        int k=2;
        list.reverseK(k);
        list.show();


    }
}
class linkedlist2 {
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
    void reversefun(node s,node e)
    {
        node cur=s;
        node nex=s.next;
        node pre=null;
        while(pre!=e)
        {
            cur.next=pre;
            pre=cur;
            cur=nex;
            if(nex!=null)
                nex=nex.next;
        }
    }
     node reversegroup(node head,int k)
     {
         if(head==null || k==1 || head.next==null )
             return head;
         node s=head;
         node e=head;
         int inc=k-1;
         while(inc-- >0)
         {
             e=e.next;
             if(e==null)
                 return head;
         }
         node nexthead=reversegroup(e.next,k);
         reversefun(s,e);
         s.next=nexthead;
         return e;
     }
     void reverseK(int k)
     {
         head=reversegroup(head,k);
     }
}