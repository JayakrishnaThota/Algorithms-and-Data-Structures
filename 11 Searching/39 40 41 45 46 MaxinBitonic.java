package SearchingAlgorithms;

public class MaxinBitonic {

    //O(logn) and O(1)
    public static int findMaximum(int[] arr){
        int n = arr.length;
        if(arr.length==1) return arr[0];
        if(arr.length==2) return Math.max(arr[0], arr[1]);
        int low = 0, high = n-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return arr[mid];
            else if(arr[mid]>arr[mid-1] && arr[mid+1]>arr[mid]) low = mid+1;
            else high = mid-1;
        }
        return arr[high];
    }

    public static void main (String[] args)
    {
        int arr[] = {1, 3, 50, 10, 9, 7, 6};
        System.out.println("The maximum element is "+
                findMaximum(arr));
    }

}
