package collections.HashMap;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap map=new HashMap();
        HashMap m1=new HashMap();
        map.put("a",2);
        map.put("b",1);
        map.put("c",3);
        System.out.println(map.put("c",10));
//        System.out.println(map.get("balaji"));
        System.out.println(map.keySet());
        m1.putAll(map);
        System.out.println(m1.remove("balaji1"));
        System.out.println(m1.entrySet());
        System.out.println("m1 method keySet()   "+m1.keySet());
        System.out.println("m1 method  values()   "+m1.values());
        System.out.println(m1);
    }
}
