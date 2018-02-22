package SearchingAlgorithms;
import java.util.*;

public class LinearSearch {
    //O(n) and O(1)
    public int linear(int[] arr, int key){
        if(arr==null || arr.length==0) return -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key) return i;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        LinearSearch s = new LinearSearch();
        System.out.println("Please enter the length of the array");
        int n = in.nextInt();
        System.out.println("Please enter the contents of the array");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        System.out.println("Please enter the key to be found");
        int key = in.nextInt();
        int result = s.linear(arr, key);
        if(result==-1) System.out.println("Key not found");
        else System.out.println("Key found at index "+result);
        in.close();
    }
}
