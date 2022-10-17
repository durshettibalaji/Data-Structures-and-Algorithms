package collections.HashMap;

import java.util.HashMap;

public class duplicateEelements {
    public static void main(String[] args) {
        int[] arr={1,2,2,1,3,4,5,6,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
        int n=arr.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr)
        {
            if(!hm.containsKey(i))
            {
                hm.put(i,1);
            }
            else
            {
                hm.put(i,hm.get(i)+1);
            }
        }
        Integer[] arr1= (hm.keySet().toArray(new Integer[0]));
        for (int i=0;i<arr1.length;i++)
        {
            if(hm.get(arr1[i])>=n/3)
                System.out.println(arr1[i]);
        }

    }
}
