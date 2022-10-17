package linkedLIst;

import java.util.ArrayList;
import java.util.LinkedList;

public class hashSet {
    //    LinkedList list=new LinkedList();
    public static void main(String[] args) {
        hashSet hs=new hashSet();
        hs.hashing();
//        System.out.println(hs.arr);
        hs.add(22);
        hs.add(12);
        hs.add(22);
        hs.add(23);
        hs.add(15);
        hs.add(11);
        System.out.println(hs.arr);

    }
        ArrayList<LinkedList<Integer>> arr = new ArrayList(10);
    void hashing() {
        for (int i = 0; i < 10; i++) {
            arr.add(new LinkedList<Integer>());
        }
    }
      int hash(int key)
        {
            return key%10;
        }
        void add(int key)
        {
          int i=hash(key);
          if(arr.get(i).contains(key))
              return;
          arr.get(i).add(key);

        }
        void remove(int key)
        {
            int i=hash(key);
            arr.get(i).remove(key);
        }
        boolean search(int key)
        {
            int i=hash(key);
            return arr.get(i).contains(key);
        }

    }
