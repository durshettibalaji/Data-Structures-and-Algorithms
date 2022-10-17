package oops.revision;

public class objectcreation {
    public static void main(String[] args) {
        car car1=new car("hexa","tata",4);
        car car2=new car("nexa","ford",3);
        car2.display();
    }
}
class car{
    String model;
    String company;
    int rating;
    car(String model,String company,int rating)
    {
        this.model=model;
        this.company=company;
        this.rating=rating;
    }
    void display()
    {
        System.out.println(this.model);
        System.out.println(this.company);
        System.out.println(this.rating);
    }
}