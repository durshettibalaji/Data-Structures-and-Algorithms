package stack;

public class stackUsingArray {
    int[] arr;
    int top;
    int capacity;
    boolean isempty()
    {
        return top<0;
    }
    stackUsingArray(int n)
    {
    top=-1;
    capacity=n;
    arr=new int[n];
    }
    boolean push(int x)
    {
        if(top>=capacity-1)
        {
            System.out.println("over flow");
            return false;
        }
        else
        {
            arr[++top]=x;
            System.out.println(x+" pushed into stack   ");
            return true;
        }
    }
    boolean pop()
    {
        if(top<0)
        {
            System.out.println("under flow");
            return false;
        }
        else
        {
            System.out.println(arr[top--]+" poped from stack");
            return true;
        }
    }
    int peek()
    {
        if(top<0)
        {
            System.out.println("empty");
            return 0;
        }
        else
        {
            return arr[top];
        }
    }
    void print()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
