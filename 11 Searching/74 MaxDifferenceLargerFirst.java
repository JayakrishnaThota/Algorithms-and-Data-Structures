package SearchingAlgorithms;
import java.util.*;

//Given an array, find the max difference between any two elements such that
//The larger number always appear after the smaller element
//Simple brute force can be done in O(n2)
//This is a O(n) and O(1) Solution
public class MaxDifferenceLargerFirst {

    //O(n) and O(1)
    public int method(int[] arr){
        if(arr==null || arr.length<2) return -1;
        int maxdiff = -1;
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            maxdiff = Math.max(maxdiff, arr[i]-min);
            min = Math.min(min, arr[i]);
        }
        return maxdiff;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        MaxDifferenceLargerFirst s = new MaxDifferenceLargerFirst();
        System.out.println("Please enter the length of the array");
        int n = in.nextInt();
        System.out.println("Please enter the contents of the array");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        if(s.method(arr)<0) System.out.println("Couldn't find indices satisying the mentioned criteria");
        System.out.println("The max difference between j and i is "+s.method(arr));
        in.close();
    }
}
