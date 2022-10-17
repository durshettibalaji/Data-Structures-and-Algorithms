package oops;

public class anonymasClass {
    public static void main(String[] args) {
        car a = new car()
        {
            public void display()
            {
                System.out.println("tata hexa");
            }

        };
        a.display();
    }
}
class car
{
   public void display()
    {
        System.out.println("hey.....!");
    }
}
