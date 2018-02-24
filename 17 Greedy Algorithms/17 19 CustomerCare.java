package Greedy;
import java.util.*;
//
////A server serves customers who are in the queue, rearrange the customers
////such that the total waiting time of all the customers is minimised
public class CustomerCare {
    public int method(int[] arr){
        Arrays.sort(arr);
        int result = 0;
        int previouswaittime = 0;
        for(int i = 0;i<arr.length;i++){
            int currentservicetime = arr[i];
            result+=previouswaittime+currentservicetime;
            previouswaittime+=currentservicetime;
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {5,2,6,8,9,43};
        CustomerCare c = new CustomerCare();
        System.out.print("The total minimized waiting time of all the customers is ");
        System.out.println(c.method(arr));
    }
}
