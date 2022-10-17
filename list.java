

public class list {
    public static void main(String[] args) {
        LL_D cl = new LL_D();
        cl.insertAtbegin(5);
        cl.insertAtlast(8);
        cl.insertAtlast(20);
        cl.insertAtlast(21);
        cl.insertAtlast(22);
        cl.deletemid(2);
        cl.printcl();
    }
    static class LL_D {
        static Node head;
        Node tail;

        static  class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        void insertAtbegin(int data){
            Node newnode = new Node(data);
            if(head==null){
                head = newnode;
                tail = newnode;
                tail.next = head;
            }
            else{
//                newnode.next = head;
//                head = newnode;
//                tail.next=head;
                newnode.next=tail.next;
                tail.next=newnode;
                head=newnode;
            }
        }
        void insertAtlast(int data){
            Node newnode = new Node(data);
            if(head==null){
                head = newnode;
                tail = newnode;
                tail.next = head;
            }
            else{
                newnode.next =head;
                tail.next=newnode;
                tail = newnode;
            }
        }
        public void addMidele(int data, int pos){
            Node newnode = new Node(data);
            int k = 0;
            Node cur = head;
            while(k<=pos-1){
                cur = cur.next;
                k++;
            }
            newnode.next = cur.next;
            cur.next = newnode;
        }
        void printcl(){
            Node temp = head;
            do{
                System.out.print(temp.data + " ");
                temp = temp.next;
            }while(temp!=tail);
            System.out.print(temp.data);
        }
        void deletefirst(){
            if(head==null){
                System.out.println("LL is empty");
            }
            tail.next=head.next;
            head = tail.next;
        }
        void deletelast(){
            if(head==null){
                System.out.println("LL is empty");
            }
            Node temp = head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            temp.next=head;
            tail=temp;
        }
        void deletemid(int pos){
            Node temp = head;
            int n=0;
            while(n<pos-1 ){
                temp=temp.next;
                n++;
            }
            temp.next =temp.next.next;
        }
    }

}