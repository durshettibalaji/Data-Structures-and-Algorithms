package stack;

import java.util.Stack;

public class queueusingstack {
    public static void main(String[] args) {
        logic q = new logic();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.pop();
        q.pop();
        q.pop();
        q.peek();


    }
}
class logic
{
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    void push(int n)
    {
        s1.push(n);
    }
    void pop()
    {
        while(!s1.empty())
        s2.push(s1.pop());
        System.out.println(s2.peek());
        s2.pop();
    }
    void peek()
    {
        while(!s1.empty())
            s2.push(s1.pop());
        System.out.println(s2.peek());
    }
}
