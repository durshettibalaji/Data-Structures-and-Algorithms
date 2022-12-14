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
        PriorityQueue<Integer> pq1=new PriorityQueue<>((a,b)-> b-a);
        for (int i = 0; i < n; i++)        //taking input to the array
        {
            arr[i] = sc.nextInt();
            pq.add(arr[i]);     // adding elements to the priority queue
            pq1.add(arr[i]);
        }
        for(int i=0;i<k-1;i++)
        {
            pq.poll();// removing k-1 small elements(removing from the queue)
            pq1.poll();
        }
        System.out.println(pq.poll());        // print the smallest element in the queue after removing k-1 smallest elements
        System.out.println(pq1.peek());

    }
}