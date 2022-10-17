public class linked_list {
    public static void main(String[] args) {
        node head=new node(10);
        node n1=new node(20);
        node n2= new node(30);
        node a=new node(5);
        a.next=head;
        head.next=n1;
        n1.next=n2;

    }

}
class  node
{
    int a=0;
    node next;
    node(int a)
    {
        this.a=a;
        next=null;
    }
    node()
    {
        next=null;
    }
}