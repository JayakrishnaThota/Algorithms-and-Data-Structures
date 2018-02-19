package Greedy;
//Given an array 'A' where A[i] indicates the cost of merging the ith file, find the optimal
//way to merge files
import java.util.*;
public class MergeFiles
{
    //O(nlogn) time and O(n) space
    public int mergefiles(int[] arr){
        if(arr==null || arr.length==0) return 0;
        int cost = 0;
        //O(nlogn)
        Arrays.sort(arr);
        //Declaration of a min prioirty queue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        //O(n)
        for(int i=0;i<arr.length;i++){
            pq.offer(arr[i]);
        }
        //O(nlogn)
        while(pq.size()>1){
            int a = pq.poll(); //O(logn)
            int b = pq.poll(); //O(logn)
            int curcost = a+b;
            pq.offer(curcost);
            cost+=curcost;
        }
        return cost;
    }
    public static void main(String[] args) {
        int[] arr = {10,5,100,50,20,15};
        MergeFiles m = new MergeFiles();
        System.out.println("The optimal cost for merging the given array is "+m.mergefiles(arr));
    }
}
