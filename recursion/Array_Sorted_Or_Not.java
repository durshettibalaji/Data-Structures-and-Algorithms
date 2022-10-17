package recursion;

public class Array_Sorted_Or_Not {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8,9,10,11,12};
//        int[] arr1={};
        System.out.println(isSorted(arr,0));
    }
    static boolean isSorted(int[] arr,int index)
    {
        if(arr.length==0)
        {
            return true;
        }
        if(index==arr.length-1)
            return true;
        System.out.println(arr[index]);
      return  arr[index]<arr[index+1] && isSorted(arr,index+1);

    }
}
