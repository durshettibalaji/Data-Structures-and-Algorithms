package kunal;
class a
{
    static class test {
        String name;
        test(String name) {
          //  System.out.println("i am inner class");
            this.name=name;
        }
    }
}

public class inner_classes {
    public static void main(String[] args) {
     a.test ab =new a.test("balaji");
     a.test bc =new a.test("chinnu");
        System.out.println(ab.name);
     System.out.println(bc.name);
    }
}
