package oops.revision.encapsulation;

public class encap1 {

   static class Encapsulate {
       private String name = "balaji";

       private void add() {
           int a = 2;
           int b = 5;
           System.out.println(a + b);
       }

       String getName() {

           System.out.print("Return the name ");
           return this.name;
       }

       void setName(String name) {
           this.name = name;
           System.out.println("The Updated Name is " + this.name);
       }
   }






        public static void main(String[] args) {
            Encapsulate   enc = new Encapsulate();
         enc.add();
        System.out.println(enc.name);

        }

    }

