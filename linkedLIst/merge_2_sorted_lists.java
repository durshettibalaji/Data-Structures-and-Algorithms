package linkedLIst;

public class merge_2_sorted_lists {
    public static void main(String[] args) {
       merge_2_sorted_lists a=new merge_2_sorted_lists();
        Node head1=null;
        head1 =a.insert(12, head1);
        head1 =a.insert(13,head1);
        head1 =a.insert(14,head1);
        head1 =a.insert(15,head1);
        head1 =a.insert(16,head1);
        Node head2=null;
        head2=a.insert(22,head2);
        head2=a.insert(23,head2);
        head2=a.insert(24,head2);
        head2=a.insert(25,head2);
        head2=a.insert(26,head2);
        head2=a.insert(27,head2);
        Node head3=null;
        head3=a.merge(head1,head2);
        a.print(head3);
    }


        static class Node{
            int val;
            Node next;
        }
        Node head;
        Node getnode(int val) {
            Node node = new Node();
            node.val = val;
            node.next = null;
            return node;
        }

        public   Node insert( int val,Node head) {
            if (head == null) {
                return getnode(val);
            }
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=getnode(val);

            return head;
        }
        public void print(Node head)
        {
            while(head!=null)
            {
                System.out.print(head.val+" ");
                head=head.next;
            }
        }
        public Node merge(Node head1,Node head2)
        {
            boolean flag=true;
            Node main =new Node();
            Node temp=main;
            while (head1!=null && head2!=null)
            {
                if(flag==true)
                {
                    flag=false;
                    main.next=head1;
                    main=main.next;
                    head1=head1.next;
                }
                if(flag==false)
                {
                    flag=true;
                    main.next=head2;
                    main=main.next;
                    head2=head2.next;
                }
            }
            if(head1!=null)
                main.next=head1;
            else
                main.next=head2;
            return temp.next;
        }
    }

