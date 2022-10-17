package stack;

public class stackusingLL {
    node head;
    int size=0;
   static class node
    {
        int val;
        node next=null;
        node(int n)
        {
            this.val=n;
        }
    }
   public void push(int n)
    {
       node temp=new node(n);
       temp.next=head;
       head=temp;
       size++;
    }
    void pop()
    {
        if(head.next==null)
            System.out.println("not possible");
        head=head.next;
        size--;
    }
    int peek()
    {
        return head.val;
    }
    void print() {
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
    boolean is_empty()
    {
        return(head==null);
    }
}
