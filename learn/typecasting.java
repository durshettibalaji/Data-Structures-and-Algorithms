import com.sun.security.jgss.GSSUtil;

public class typecasting {
    public static void main(String[] args) {
        int a=12;
        char c='a';
        float b=56.89f; //a is converted to float as for subtraction or other operations should same type on both
        System.out.println(a-b+" "+(c+a));//char c is converted into assci value
        b=(int)356.678f;
        System.out.println((byte)b);//max byte can hold upto 256 if number greater than 256 then it will give the remainder
        String k="नमस्कार";
        System.out.println(k);
    }
}
