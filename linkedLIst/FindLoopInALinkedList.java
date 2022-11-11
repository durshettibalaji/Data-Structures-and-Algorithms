package linkedLIst;
import java.util.Arrays;
import java.util.List;

public class FindLoopInALinkedList {

    Node head;

    public static void main(String[] args) {
        FindLoopInALinkedList obj = new FindLoopInALinkedList();
        List<Integer> listContents = Arrays.asList(1, 2, 3, 4, 5, 6);
        for (Integer eachNumber : listContents) {
            obj.addElementFromRear(eachNumber);
        }
        obj.createLoop();
        obj.loopfind();

    }

    void createLoop() {
        Node temp = head;
        Node toBeAttached = null;
        while (temp.next != null) {

            if (temp.data == 3) {
                toBeAttached = temp;
            }
            temp = temp.next;
        }
        temp.next = toBeAttached;
    }

    void addElementFromRear(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(data);
        return;
    }

    void printList() {
        System.out.print("\nElements in the list are.. :- ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
    void loopfind()
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {

            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
                break;
        }
        if(slow!=fast) {
            System.out.println("There is no loop in list");
            return ;
        }
        slow=head;
        while(slow.next!=fast.next)
        {
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
        printList();

    }



    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
