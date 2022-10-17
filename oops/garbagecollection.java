package kunal.oops;
/*
    in java we mannualy can not destroy any object
 but we can get known when the object is destroyed by garbage collector
*/

public class garbagecollection {
    public static void main(String[] args) {
        human obj;  // declear obj as variable of type human
        for(int i=0;i<100;i++)
            obj= new human("balaji");
        /*  creating 100 objects and givung the same reference variable
            so that the previously created obect wont have any reference
            when heap value exceed it delete that obects with no reference
         */
    }
}
class human {
    final int a = 234;
    String name;

    human(String name) {
        this.name=name;
        System.out.println("object created of class human");

    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object destroyed");
    }

}