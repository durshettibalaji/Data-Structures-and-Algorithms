package collections.LinkedList;

import java.util.LinkedList;

public class methods_Linkedlist {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        // add (add element at end of the linkedlist)
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        //add(index,object) (add element at specific index)
        list.add(1,10);
        System.out.println(list);
        // add(index,collection)
        LinkedList list1=new LinkedList();
        list1.add(11);
        list1.add(12);
        list1.add(13);
        list.add(1,list1);
        System.out.println(list);


        //contains(object) (check element contined in it or not)
        System.out.println("list.contains(10) :-"+list.contains(10));
        System.out.println("list.contains(11) :-"+list.contains(11));

        //get(index) (element present at that index)
        System.out.println("element at index 2 :-"+list.get(2));

        //getFirst() (gives the first element)
        System.out.println("getFirst() :-"+list.getFirst());

        //geLast() (gives the last eleent)
        System.out.println("geLast() :-"+list.getLast());

        //indexOf(Object o) (gives index of that object)
        System.out.println("indexOf(2) gives :-"+list.indexOf(2));

        //removeLast (removes last element)
        list.removeLast();
        System.out.println(list);

        //toArray
        Object[] arr= list.toArray();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        //clear() (clears all the elements in it)
        list.clear();
        System.out.println(list);




    }
}
