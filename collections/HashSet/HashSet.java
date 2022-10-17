package collections.HashSet;

public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<Integer> s=new java.util.HashSet<>(5);
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(6);
        s.add(3);
        s.add(5);
        System.out.println(s.size());

    }
}
