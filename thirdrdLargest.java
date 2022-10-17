public class thirdrdLargest {
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 8, 9};
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(a<=arr[i])
            {
                a=arr[i];
            }
           else if(b<arr[i] && arr[i]>=a)
            {
                b=arr[i];
            }
           else if(c<arr[i] && arr[i]>=b)
            {
                c=arr[i];
            }
        }
    }
}
