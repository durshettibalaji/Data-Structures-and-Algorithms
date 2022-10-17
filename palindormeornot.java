public class palindormeornot {
    public static void main(String[] args) {
        String s="abba";
        int i=0,j=s.length()-1;
        boolean a=true;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            if(s.charAt(i)!=s.charAt(j))
            {
                a=false;
                break;
            }
        }
            System.out.println(a);
    }
}
