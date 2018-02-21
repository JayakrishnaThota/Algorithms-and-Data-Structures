package DynamicProgramming;

import java.util.Scanner;

public class LargestSumSubarray {

    //O(n) time and O(1) space
    public int LargestSumSubarray(int[] arr){
        if(arr==null || arr.length==0) return 0;
        int maxsofar = arr[0], maxendinghere = arr[0];
        for(int i=0;i<arr.length;i++){
            maxsofar = Math.max(maxsofar, maxsofar+arr[i]);
            maxendinghere = Math.max(maxendinghere, maxsofar);
        }
        return maxendinghere;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        LargestSumSubarray f = new LargestSumSubarray();
        System.out.println("Please enter the array length");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Largest sum subarray is "+f.LargestSumSubarray(arr));
    }
}

