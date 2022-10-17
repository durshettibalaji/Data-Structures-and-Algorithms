// don't change the name of this class
// you can add inner classes ipackage
package array;
import java.util.*;
class pair_sum {
    public static void main (String[] args) {
  int[] arr={1,3,2,10,5,7,8,4};
  //====================================    aproch 1  ===================================================
  // t.c = O(n^2)
  //s.c = O(1)
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==12)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
//          *********************      approch 2     *******************************************
// t.c =O(nlong)
//  s.c=O(1)
  Arrays.sort(arr);     //sort the array
  int c=0;
  for(int i=0,j=arr.length-1;i<j;)
  {
      if(arr[i]+arr[j]==12)
      {
          c++;
          System.out.println("("+arr[i]+","+arr[j]+")");
          i++;
      }
      else if(arr[i]+arr[j]<12)
      {
          i++;
      }
      else
          j--;
  }
        System.out.println(c);
    }
}


