package linkedLIst;

public class binaryToInteger {
    public static void main(String[] args) {
        binarytoint bi=new binarytoint();
        bi.insert(1);
        bi.insert(0);
        bi.insert(1);
//        bi.insert(0);

        bi.method1();
        bi.optimal();

        int sum=0;

    }
}
class binarytoint {
    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

        node head = null;

        void insert(int data) {
            node newNode = new node(data);
            node temp = head;
            if (head == null) {
                head = newNode;
            } else {
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }

        }

        void delete() {
            node temp = head;
            if (head == null) {
                System.out.println("deletion not possible");
            } else {
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
        }

        void print() {
            node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        int length()
        {
            int c=0;
            node temp=head;
            while (temp!=null)
            {
                temp=temp.next;
                c++;
            }
            return c;
        }
        void method1()
        {
            int n=this.length()-1;
            node temp=head;
            int sum=0;
            while(temp!=null)
            {
                sum=sum+((int)Math.pow(2,n )*temp.data);
                temp=temp.next;
                n--;
            }
            System.out.println(sum);
            // time :- o(n)+O(n)
        }
        void optimal()
        {
            int ans=0;
            node temp=head;
            while (temp!=null)
            {
                ans=(ans*2)+(1*temp.data);
                temp=temp.next;

            }
            System.out.println(ans);
        }

    }
