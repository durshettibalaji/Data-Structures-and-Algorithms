package striver;

public class count_Inversions_array {
    public static void main(String[] args) {
        int[] arr={8,4,2,1};
        int ans= mergeSort(arr,0,arr.length-1);
        System.out.println(ans);
        for(int i:arr)
            System.out.print(i+" ");
    }
  public static   int mergeSort(int[] arr,int l,int h)
    {
        int c=0;
        if(l<h)
        {
            int mid=(l+h)/2;
           c+= mergeSort(arr,l,mid);
           c+= mergeSort(arr,mid+1,h);
            c+=merge(arr,l,mid,h);
        }
        return c;
    }
  public static   int merge(int[] arr,int l,int mid,int h)
    {
        int n1=mid-l+1;
        int n2=h-mid;
        int[] a=new int[n1];
        int[] b=new int[n2];
        for(int i=0;i<n1;i++)
        {
            a[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++)
        {
            b[i]=arr[mid+i+1];
        }
        int i=0,j=0,k=l;
        int c=0;
        while(i<n1 && j<n2)
        {
            if(a[i]<b[j])
            {
                if(a[i]==b[i])
                    System.out.println(a[i]);
                arr[k]=a[i];
                i++;
            }
            else
            {
                arr[k]=b[j];
                j++;
                c+=n1-i;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k]=a[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=b[j];
            j++;
            k++;
        }
        return  c;
    }

}







//============================================ preeti code=====================================================================
//
//package recursion;
//
//        import java.util.Scanner;
//
//public class mergeSort {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//
//        for(int i =0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(n);
//        mergesort(arr,0,n-1);
//
//    }
//    public static void mergesort(int[] arr, int start,int end){
//
//        if(start>=end){
//            return;
//        }
//
//        int mid= (start+end)/2;
//        mergesort(arr,start,mid);
//        mergesort(arr,mid+1,end);
//        conquere(arr,start,mid,end);
//
//    }
//    public static  void conquere(int[]arr,int s,int mid,int e){
//        int [] temp = new int[e-s+1];
//        int x=0,i,j;
//        int idx1 = s;
//        int idx2 = mid;
//        while(idx1<mid && idx2<e){
//            if(arr[idx1]<arr[idx2]){
//                temp[x] = arr[idx1];
//                x++;
//                idx1++;
//            }
//            else{
//                temp[x] = arr[idx2];
//                x++;
//                idx2++;
//            }
//        }
//        while(idx1<mid){
//            temp[x] = arr[idx1];
//            x++;
//            idx1++;
//        }
//        while(idx2<e){
//            temp[x] = arr[idx2];
//            x++;
//            idx2++;
//        }
//        for( i=0,j=s;i<arr.length;i++,j++){
//            arr[s] = temp[i];
//        }
//    }
//}