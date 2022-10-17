package sortingandsearching;

public class bubbleSsort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 1, 6};
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length-1; i++) {
                while (arr[i] > arr[i + 1]) {
                    swap(arr, i+1, i );
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]);
    }
    static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

}
