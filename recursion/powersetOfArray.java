package recursion;

import java.util.ArrayList;
import java.util.List;

public class powersetOfArray {
    static  int i=0;
    public static void main(String[] args) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        int[] arr={1,2,3};
        ans(arr,0,res,li);
        System.out.println(res);

    }
    static  void  ans(int[] arr,int index,List<List<Integer>> res,List<Integer> output)
    {
//        System.out.println(++i);
        if(index>=arr.length)
        {
            res.add(new ArrayList<>(output));
            return;
        }
        output.add((arr[index]));
        ans(arr,index+1,res,output);
        output.remove(output.size()-1);
        ans(arr,index+1,res,output);
    }
}
