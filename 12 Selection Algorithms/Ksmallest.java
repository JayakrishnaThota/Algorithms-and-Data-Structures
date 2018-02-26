package SelectionAlgorithms;
import java.util.*;
//Given an array and a value k, find the k smallest elements in the array
//A simple solution is to sort the array and report all elements from 0 to k-1
//In this program, we look at a partition based method
public class Ksmallest {

    public int[] ksmallest(int[] nums, int k)
    {
        int low = 0;
        int high = nums.length-1;
        int pivot = 0;
        int[] result = new int[k];
        while (low<high){
            pivot = partition(nums,low,high);
            if(k==pivot){
                for(int i=0;i<pivot;i++){
                    result[i] = nums[i];
                }
                break;
            }
            else if(pivot<k) low = pivot+1;
            else high = pivot-1;
        }
        return result;
    }

    public int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        // swap arr[i+1] and arr[high] (or pivot)
        swap(arr,i+1,high);
        return i+1;
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void display(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
            if(i==nums.length-1) continue;
            System.out.print(", ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int[] nums = {3,7,3,2,4,5};
        Ksmallest k = new Ksmallest();
        int[] result = k.ksmallest(nums,3);
        k.display(result);
    }
}
