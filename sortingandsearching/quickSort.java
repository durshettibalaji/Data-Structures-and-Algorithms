package sortingandsearching;

public class quickSort {
    public static void main(String[] args) {
        int[] arr={3,2,1};
        sort(arr,0,arr.length-1);
        print(arr);
    }
    static void sort(int[] arr,int l,int h)
    {
        if((l>=h))
            return ;

           int p= partion_sharadhadhidi(arr,l,h);
            sort(arr,l,p-1);
            sort(arr,p+1,h);
    }
    static int partion_lovebabbar(int[] arr,int low,int high)
    {
//        print(arr);
        int pivot=arr[high];
        int count=0;
        for(int i=low;i<high;i++)
        {
            if(arr[i]<=pivot)
                count++;
        }
        int index=low+count;
        swap(arr,index,high);
        int i=low,j=high;
        while(i<index && j>index)
        {
            while(arr[i]<=pivot)
                i++;
            while(arr[j]>pivot)
                j--;
            if(i<index && j>index)
                swap(arr,i++,j--);
        }
        return index;

    }
    static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }



    static int partion_sharadhadhidi(int[] arr,int low,int high)
    {
        int pivot=arr[high];
        int i=low-1;
        for(int k=low;k<high;k++)
        {
            if(arr[k]<pivot) {
                i++;
                swap(arr, k, i);

            }
        }
        i++;
        swap(arr,i,high);
        return i;
    }
}
