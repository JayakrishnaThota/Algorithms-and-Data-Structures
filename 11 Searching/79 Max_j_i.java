package SearchingAlgorithms;

import java.util.*;
//Given an array, find the max j-i such that A[j] > A[i]
//If there are no such indices return -1;
public class Max_j_i {
    //O(n) and O(n)
    private int method(int[] arr){
        if(arr==null || arr.length<2) return -1;
        int maxdiff = -1;
        int n = arr.length;
        //Stores less than or equal to the given element on the left
        int[] left = new int[n];
        //Stores greater than or equal to the given element on the right
        int[] right = new int[n];
        int min = arr[0]; left[0] = min;
        for(int i=1;i<n;i++){
            min = Math.min(min, arr[i]);
            left[i] = min;
        }
        int max=arr[n-1]; right[n-1] = max;
        for(int i=n-2;i>=0;i--){
            max = Math.max(max, arr[n-2]);
            right[i] = max;
        }
        int i=0,j=0;
        while(i<n && j<n){
            if(left[i]<right[j]){
                maxdiff = Math.max(maxdiff, j-i);
                j++;
            }
            else{
                i++;
            }
        }
        return maxdiff;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Max_j_i s = new Max_j_i();
        System.out.println("Please enter the length of the array");
        int n = in.nextInt();
        System.out.println("Please enter the contents of the array");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        System.out.println("The max difference between j and i is "+s.method(arr));
        in.close();
    }
}
