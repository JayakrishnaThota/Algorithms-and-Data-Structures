package SearchingAlgorithms;

import java.util.*;

public class InterpolationSearch {

    //O(n) and O(1)
    public int inter(int[] arr, int val){
        if(arr==null || arr.length==0) return -1;
        int n = arr.length;
        int low=0, high = n-1;
        while(arr[low]<=val && arr[high]>=val){
            if(arr[low]-arr[high]==0) return (low+high)/2;
            int mid = low + (val-arr[low])*(high-low)/(arr[high]-arr[low]);
            if(arr[mid]>val) high = mid-1;
            else if(arr[mid]<val) low = mid+1;
            else return mid;

        }
        if(arr[low]==val) return low;
        return -1;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        InterpolationSearch s = new InterpolationSearch();
        System.out.println("Please enter the length of the array");
        int n = in.nextInt();
        System.out.println("Please enter the contents of the array");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        System.out.println("Please enter the key to be found");
        int key = in.nextInt();
        int result = s.inter(arr, key);
        if(result==-1) System.out.println("Key not found");
        else System.out.println("Key found at index "+result);
        in.close();
    }
}
