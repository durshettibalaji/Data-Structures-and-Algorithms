package kunal;
class abc
{
    static int a=20;
    static int b;
    static {
        System.out.println("i am in static block and this block will run only once   how many objects you create");
        b=a*3;
    }

}
public class static_block {
    public static void main(String[] args) {
        abc ab=new abc();
        ab.a=45;
        System.out.println(ab.b);
    }
}
