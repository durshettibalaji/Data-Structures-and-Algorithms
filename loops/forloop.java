package loops;

public class forloop {
    public static void main(String[] args) {
        int k=0;
        for(int i=0;i<1;i++)
        {
            System.out.println("hare krishna hare krishna \nkrishna krishna hare hare\nhare rama hare rama\nrama rama hare hare\n");
        }
        for(int j=0;j<10;j+=2)
        {
            System.out.println(j);//skips one print one repeat
        }
        for(int i=1;i<512;i=i*2)
        {
            System.out.println(i+" "+k++);
        }
    }
}
