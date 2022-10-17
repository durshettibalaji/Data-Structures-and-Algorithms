package linkedLIst;

public class circularLL1 {
    public static void main(String[] args) {
        circularlinkedlist cll = new circularlinkedlist();
        cll.insert(1);
        cll.insert(2);
        cll.insert(3);
        cll.insert(89);
        cll.insert(22);
      cll.deletion(4);
       cll.show();
        System.out.println(cll.tail.val);
    }
}