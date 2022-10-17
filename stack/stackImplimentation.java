package stack;

public class stackImplimentation {
    public static void main(String[] args) {
        stackUsingArray stock=new stackUsingArray(2);
        stock.push(10);
        stock.push(20);
        stock.push(30);
        stock.pop();
        stock.push(40);
        stock.print();
    }
}
