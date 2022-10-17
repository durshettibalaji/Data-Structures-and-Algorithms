public class sum {
    public static void main(String[] args) {
        String s="absnnabcfgdnnarsrssrfsuugfsnnnssdrsnnnasd";
        int a=0;
        int b=0;
        int k=0;
        int c=0;
        int m=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='n')
            {
                a++;
            }
            if(a==2)
            {
                k=m;
                break;
            }
            m++;
        }
        m=s.length()-1;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='n')
            {
                b++;
            }
            if(b==2)
            {
                c=m;
            }
            m--;
        }
        System.out.println(s.substring(k,c));
    }
}
