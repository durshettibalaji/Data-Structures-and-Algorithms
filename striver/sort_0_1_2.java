package striver;

import most_usefull_functions.swap;

public class sort_0_1_2 {
    public static void main(String[] args) {

    }
    void sort123(int[] arr)
    {
        int mid=0,low=0,high=arr.length-1;
        while (low<=high)
        {
            if(arr[mid]==0)
            {
                swap.swap(arr,mid,low);
                low++;
                mid++;
            }
             else if(arr[mid]==1)
            {
                mid++;
            }
             else
            {
                swap.swap(arr,mid,high);
                high--;
            }
        }
    }
}
