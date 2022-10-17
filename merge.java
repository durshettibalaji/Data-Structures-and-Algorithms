public class merge {
    public static void main(String[] args) {
        merge mg = new merge();
        mg.intf(1);
        mg.intf(3);
        mg.intf(5);
        mg.ints(2);
        mg.ints(4);
        mg.merge();
        mg.print();

    }

    class node {
        int val;
        node next;

        node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    node head1 = null;
    node head2 = null;
    node head = null;

    void intf(int val) {
        node newnode = new node(val);
        if (head1 == null) {
            head1 = newnode;
        } else {
            node temp = head1;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    void print() {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
}
void ints(int val)
    {
        node n=new node(val);
        if(head2==null)
        {
            head2=n;
        }
        else
        {
            node temp=head2;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n;
        }
    }
void merge()
{

    node temp=head;
    while(head1!=null && head2!=null)
    {
        if(head1.val<=head2.val)
        {
            temp=head1;
            head1=head1.next;
            System.out.println(temp.val);
        }
        else
        {
            temp=head2;
            head2=head2.next;
        }

//        System.out.println(head.val);
        temp=temp.next;
    }
    while (head1!=null)
    {
        temp=head1;
        head1=head1.next;
        temp=temp.next;
    }
    while(head2!=null)
    {
        temp=head2;
        head2=head2.next;
        temp=temp.next;
    }

//    System.out.println(head.val);

}

}
