package sortingandsearching;

public class mergeSortInterview {
    public static void main(String[] args) {
        int[] arr={1,5,3,2,7,9,10};
        sort(arr,0,arr.length-1);
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    static void sort(int[] arr,int l,int h)
    {
        if(l<h) {
        int mid = l + (h - l) / 2;
        sort(arr, l, mid);
        sort(arr, mid + 1, h);
        merge(arr, l, mid, h);
    }
    }
    static void merge(int[] arr,int l,int m,int h)
    {
        int n1=m-l+1;
        int n2=h-m;
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];
        for(int i=0;i<n1;i++)
        {
            arr1[i]=arr[i+l];
        }
        for(int j=0;j<n2;j++)
        {
            arr2[j]=arr[m+1+j];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2)
        {
            if(arr1[i]<=arr2[j])
            {
                arr[k]=arr1[i];
                i++;
            }
            else
            {
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }
        while (i<n1)
        {
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=arr2[j];
            j++;
            k++;
        }
    }

}
