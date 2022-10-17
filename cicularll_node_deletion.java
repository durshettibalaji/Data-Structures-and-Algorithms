public class cicularll_node_deletion {
    public static void main(String[] args) {
        cicularll_node_deletion cl=new cicularll_node_deletion();
        cl.push(0);
        cl.push(1);
        cl.push(2);
        cl.push(3);
        cl.push(4);
        cl.push(5);
        cl.push(6);
        cl.push(7);
        cl.push(8);
        cl.deletealloddposition();
        cl.print();
    }
    class  node{
        node next;
        int val;
        node(int val)
        {
            this.next=null;
            this.val=val;
        }
    }
    node head=null;
    node rare=null;
    void push(int val)
    {
        node newnode=new node(val);
        if(head==null)
        {
            head=newnode;
            rare=newnode;
            head.next=rare;
        }
        else
        {
            node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            temp.next=newnode;
            rare=newnode;
            rare.next=head;
        }
    }
    void print()
    {
        node temp=head;
        while(temp!=rare)
        {
            System.out.println(temp.val);
            temp=temp.next;
        }
        System.out.println(temp.val);
//        System.out.println(temp.next.val);
    }
    void deletealloddposition()
    {
        node temp=head;
        int c=0;
        while(temp!=rare) {
            if (c % 2 == 0) {
                temp.next = temp.next.next;
                temp = temp.next;
                c=c+2;
            } else {
                temp = temp.next;
                c++;
            }
        }
    }
}
