package linkedLIst;

public class pairDLL {
    static Node1 head;
    public static void main(String[] args) {
        int k=7;
        insert(9);
        insert(8);
        insert(6);
        insert(4);
        insert(3);
        insert(2);
        insert(1);
        print(head);
        System.out.println();
        Node1 first=head;
        Node1 temp=head;
        while (temp.next!=null)
            temp=temp.next;
//        System.out.println(temp.data);
        Node1 last=temp;
        while(first!=last)
        {

            if(last.data+first.data==k)
            {
                System.out.println(last.data+"  "+ first.data);
                if(first.next==last)
                {
                    break;
                }
                last=last.pre;
                first=first.next;
            }
            else if(last.data+first.data<k)
            {
                first=first.next;
            }
            else
            {
                last=last.pre;
            }
        }

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
}
