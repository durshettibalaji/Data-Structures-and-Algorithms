package lovebabar_dsa;

import java.util.PriorityQueue;
import java.util.Scanner;

public class kthSmallest_q3_pqueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    //taking input size of array
        int k = sc.nextInt();   //taking k
        int arr[] = new int[n];   //declearing and intialsing the array
        PriorityQueue<Integer> pq=new PriorityQueue<>();  //instalizing priority queue
        for (int i = 0; i < n; i++)        //taking input to the array
        {
            arr[i] = sc.nextInt();
            pq.add(arr[i]);                    // adding elements to the priority queue
        }
        for(int i=0;i<k-1;i++)
        {
            pq.poll();                        // removing k-1 small elements(removing from the queue)
        }
        System.out.println(pq.poll());        // print the smallest element in the queue after removing k-1 smallest elements

    }
}