package RecursionandBackTracking;

public class VerifySort {

    private static boolean helper(int[] arr, int n){
        if(n==1) return true;
        return (arr[n-1]<arr[n-2])?false:helper(arr,n-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(helper(arr,arr.length));
    }
}
