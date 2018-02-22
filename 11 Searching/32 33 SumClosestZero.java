package SearchingAlgorithms;
import com.sun.org.apache.xml.internal.security.algorithms.implementations.IntegrityHmac;

import java.util.*;

public class SumClosestZero {
    //O(nlogn) and O(1)
    public static int method(int[] arr){
        Arrays.sort(arr);
        int n = arr.length, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int low = 0, high = n-1;
        while(low<high){
            int sum = arr[low]+arr[high];
            if(sum==0) return sum;
            else if(sum>0){
                min = Math.min(min, sum);
                high--;
            }
            else{
                max = Math.max(sum,max);
                low++;
            }
        }
        return Math.min(Math.abs(max), min);
    }

    public static void main(String[] args) {
        int[] arr = {1, 60, -10, 70, -80, 85};
        System.out.println(method(arr));
    }
}
