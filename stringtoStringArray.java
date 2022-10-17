import java.util.ArrayList;

public class stringtoStringArray {
    public static void main(String[] args) {
        String s = "i like java";
        ArrayList<String> str = new ArrayList<>();
        ArrayList<String> str2 = new ArrayList<>();
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                s1 += s.charAt(i);
            } else if (s.charAt(i) == ' ') {
                str.add(s1);
                s1 = "";
            }
        }
        str.add(s1);
        for (int i = 0; i < str.size(); i++) {
            s1 = str.get(i);
            String s2=s1.substring(1,s1.length());
            String s3=s1.substring(0,1);
            String s4=s3.toUpperCase()+s2;
            str2.add(s4);
        }
        System.out.println(str2);
    }
}
