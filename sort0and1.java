public class sort0and1 {
    public static void main(String[] args) {
        int[] arr={0,1,1,1,0,0,1,1,1,0,0};
        int[] temp=new int[arr.length];
        int i=0,j=arr.length-1,k=0;
        while(i<j)
        {
            if(arr[k]==0)
            {
                temp[i]=arr[k];
                i++;
            }
            else if(arr[k]==1)
            {
                temp[j]=arr[k];
                j--;
            }
            k++;
        }
        for(int l=0;l<temp.length;l++)
        {
            System.out.print(temp[l]+" ");
        }
    }
}
