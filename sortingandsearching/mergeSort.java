package sortingandsearching;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr={5,9,679,1,7,6};
        sort(arr,0,arr.length-1);
        print(arr);
//      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"+a+"  "+b);
    }
    static void sort(int[] arr,int l,int h)
    {
        if(l<h)
        {
            int mid=(h+l)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,h);
            merge(arr,l,mid,h);
        }
    }
    static void merge(int[] arr,int l,int mid,int h)
    {
        int n1=mid-l+1;
        int n2=h-mid;
        int[] a=new int[n1];
        int[] b=new int[n2];
        for (int i=0;i<n1;i++)
            a[i]=arr[l+i];
        for(int i=0;i<n2;i++)
            b[i]=arr[mid+i+1];
        int i=0,j=0,k=l;
        while(i<n1 && j<n2)
        {
            if(a[i]<b[j]) {
                arr[k] = a[i];
                i++;
            }
           else if(a[i]>b[j])
            {
                arr[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k++]=a[i++];
        }
        while (j<n2)
        {
            arr[k++]=b[j++];
        }
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
