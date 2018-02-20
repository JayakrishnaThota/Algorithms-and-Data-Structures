package SearchingAlgorithms;
import java.util.*;

//Given an array, find an index such that it is smaller than both it's neighbors
public class LocalMinimum {

    //O(logn) time and O(1) space
    private int method(int[] arr) throws IllegalArgumentException{
        if(arr==null || arr.length==0) throw new IllegalArgumentException("Array is empty");
        int n = arr.length;
        int low = 0, high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if((mid==0 || arr[mid]<arr[mid-1])&&(mid==n-1 || arr[mid]<arr[mid+1])) return mid;
            else if(mid>0 && arr[mid]>arr[mid-1]) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        LocalMinimum s = new LocalMinimum();
        System.out.println("Please enter the length of the array");
        int n = in.nextInt();
        System.out.println("Please enter the contents of the array");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        System.out.println("The local minimum index in the array is "+s.method(arr));
        System.out.println("and the element is "+arr[s.method(arr)]);
        in.close();
    }
}
