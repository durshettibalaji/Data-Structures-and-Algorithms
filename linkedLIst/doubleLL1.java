package linkedLIst;

public class doubleLL1 {
    public static void main(String[] args) {
        doubleLL dd = new doubleLL();
        dd.insert(1);
        dd.insert(2);
        dd.insert(3);
        dd.insert(3,12);
        dd.insert(3,67);
//       dd.deletion(0);
        dd.show();
        System.out.println(dd.head.next.pre.val);
    }
}
