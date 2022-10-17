package linkedLIst;

public class mergeObjects {
    public static void main(String[] args) {
        String a="abceabcdabceabcd";
        String b="abcd";

        //        node node1= new node(1);
//        node node2= new node(2);
//        node node3= new node(3);
//        ArrayList<node> li=new ArrayList<>();
//        li.add(node1);
//        li.add(node2);
//        li.add(node3);
//        System.out.println(li);

    }

}
//class mergclass{
//    node head = null;
    class node {

        int emid;
        String name;
        int age;
        String mail;
        String state;
        node next;
        node()
        {
            this.emid=120;
        }

        node(int id, String name, int age) {
            this.emid = id;
            this.name = name;
            this.age = age;
            this.next = null;
        }
        public String toString(){
            return name+" "+emid+" "+age;
        }
    }
//        void insert(int id,String name,int age)
//        {
//            node newnode=new node(id,name,age);
//            if(head==null)
//            {
//                head=newnode;
//            }
//            else
//            {
//                newnode.next=head;
//                head=newnode;
//            }
//        }
//        void print(node head)
//        {
//            node temp=head;
//            while(temp!=null)
//            {
//                System.out.println(temp);
//                temp=temp.next;
////                System.out.println(temp.emid);
//            }
//        }
//
//        node head1=null;
//
//
//    }
