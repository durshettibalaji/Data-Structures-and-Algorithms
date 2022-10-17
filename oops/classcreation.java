package kunal.oops;


import java.sql.SQLOutput;

class Student
{
    String name;
    int rool;
    float avg_mark;
    void greet()
    {
        System.out.println("hey how are you "+name);
    }
     Student(String name,int rool,float avg_mark)    /* this is a constructor */
    {
        this.name=name;
        this.rool=rool;
        this.avg_mark=avg_mark;
    }
    // overloading
    Student ()
    {
        this.name="god";
        this.rool=1234;
        this.avg_mark=100.00f;
    }
    Student(Student other)
    {
        this.name=other.name;
        this.rool= other.rool;
        this.avg_mark=other.avg_mark;
    }

}

public class classcreation {
    public static void main(String[] args) {
        Student b=new Student("balaji",514,412.63f);
        Student a=new Student("chinnu",23,78.34f);
        /* we can call constructor with parameters and without parameters this know as overloading*/
        Student shiva=new Student();
        Student d=a;
        Student ab=new Student(b);  //taking other object as input
        System.out.println(b.name+"\n"+b.rool+"\n"+b.avg_mark);
        System.out.println(a.name+"\n"+a.rool+"\n"+a.avg_mark);
        a.greet();
        b.greet();
        shiva.greet();
        ab.greet();
        d.greet();

        /*
        -> here d and a are pointing to the same object  a and d are stored in stack and object stored in heap
        -> if you do any change in a then same thing happens in the c */
    }

}
