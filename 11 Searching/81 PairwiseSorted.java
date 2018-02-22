package SearchingAlgorithms;

import java.util.*;
//Given an array, check if it is pairwise sorted or not
//By pairwise sorted means , the consecutive pairs must be in non-decreasing order
public class PairwiseSorted {
    //O(n) time and O(1) space
    public boolean isPairwise(int[] arr){
        if(arr==null | arr.length<2) return true;
        for(int i=0;i<arr.length-1;i+=2){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PairwiseSorted s = new PairwiseSorted();
        System.out.println("Please enter the length of the array");
        int n = in.nextInt();
        System.out.println("Please enter the contents of the array");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        System.out.println("Is the given array pairwise sorted? "+s.isPairwise(arr));
        in.close();
    }
}
