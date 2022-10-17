public class sort012 {
    public static void main(String[] args) {
        int[] arr={0,1,0,2,0,1,0,2,0,1,0,2};
        int a=0,b=0,c=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==0)
            {
                a++;
            }
            else if(arr[i]==1)
            {
                b++;
            }
            else
            {
                c++;
            }
        }
   for(int i=0;i<a;i++)
   {
       arr[i]=0;
   }
        for(int i=a;i<b+a;i++)
        {
            arr[i]=1;
        }
        for(int i=a+b;i<a+b+c;i++)
        {
            arr[i]=2;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
