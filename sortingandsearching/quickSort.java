package sortingandsearching;

public class quickSort {
    public static void main(String[] args) {
        int[] arr={3,5,0,1,2,4};
        print(arr);
        sort(arr,0,arr.length-1);
        print(arr);
    }
    static void sort(int[] arr,int l,int h)
    {
        if(l<h)
        {
           int p= partion(arr,l,h);
            sort(arr,l,p-1);
            sort(arr,p+1,h);
        }
    }
    static int partion(int[] arr,int l,int h)
    {
        int pivot=arr[l];
        int count=0;
        int index=0;
        for(int i=l+1;i<=h;i++)
        {
            if(arr[i]<=pivot)
                count++;
        }
        index=l+count;
        swap(arr,l,index);
        int i=l,j=h;
        while(i<index && j>index)
        {
            while(arr[i]<pivot)
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

}
