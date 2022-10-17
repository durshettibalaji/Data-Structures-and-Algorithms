package kunal;
/* single ton class can have only one object*/
class life
{
    String name;
    static int abc=0;

    private life(String name)
    {
        System.out.println("object as been created "+name);
        abc+=1;
    }
    private static life inst;
    static life get(String name)
    {
     if(inst==null)
     {
         inst=new life(name);

     }
     return inst;
    }
}
public class singleton {
    public static void main(String[] args) {
        life ab=life.get("balaji");
        life ac=life.get("chinnu");
        System.out.println(ac.abc);
    }

}
