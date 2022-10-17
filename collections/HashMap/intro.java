package collections.HashMap;

import java.util.HashMap;

public class intro {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(1,2);
        hm.put(2,3);
        hm.put(5,3);
        System.out.println("befor modifying  :-"+hm);
        hm.put(2,10);
        System.out.println("after modifying  :-"+hm);
        hm.remove(1);
        System.out.println("after removing   :-"+hm);
        for(HashMap.Entry<Integer,Integer> ele:hm.entrySet()){
            System.out.println("key:- "+ele.getKey()+"   vaule:-"+ele.getValue());
        }
    }
}
