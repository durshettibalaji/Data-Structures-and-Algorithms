public class anogram {
    public static void main(String[] args) {
        String a="listen";
        String b="sillet";
        System.out.println(anogram(a,b));
    }
    static boolean anogram(String a,String b)
    {
        if(a.length()!=b.length())
            return false;
        int[] arr1=new int[256];
        int[] arr2=new int[256];
        for(int i=0;i<a.length();i++) {
            arr1[(int) a.charAt(i)] += 1;
            arr2[(int) b.charAt(i)] += 1;
        }
        for(int i=0;i<256;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                return false;
            }
        }
        return true;
    }
}
