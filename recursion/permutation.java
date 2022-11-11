package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation {
    public static void main(String[] args) {
        List<List<Integer>> ans=new ArrayList<>();
        int[] arr={1,2,3};
        rec(ans,arr,0);
        System.out.println(ans);

    }
    static  int i=0;
    public static void rec(List<List<Integer>> ans,int[] arr,int index)
    {
//        System.out.println(++i);
        if(index>=arr.length)
        {
            List<Integer> list= Arrays.stream(arr).boxed().toList();
            ans.add(list);
        }
        for(int i=index;i<arr.length;i++)
        {
            swap(arr,index,i);
            rec(ans,arr,index+1);
            swap(arr,i,index);
        }

    }


    public static  void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
