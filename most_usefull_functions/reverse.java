package most_usefull_functions;

public class reverse {
    public static void main(String[] args) {

    }
    public static void reverse(int[] arr,int l,int h)
    {
        while(l<h)          // in while loop we are swaping the elements like frist element with last
        {                    //secnod  element with second last and so on till every element get swaped in case of even no of elements
            int temp=arr[l];  //in case of odd number of elements we wont swap it with any element bcz it is in middle it not effect
            arr[l]=arr[h];     //even if we did we should do it with same number
            arr[h]=temp;
            l++;
            h--;
        }
    }

}
