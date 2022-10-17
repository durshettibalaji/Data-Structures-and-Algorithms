package recursion;

public class reverseTheArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverseArray(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

    }
    static void reverseArray(int[] arr,int l,int h)
    {
        if(l>=h)
            return;
        int temp =arr[l];
        arr[l]=arr[h];
        arr[h]=temp;
        reverseArray(arr,l+1,h-1);
    }
}
