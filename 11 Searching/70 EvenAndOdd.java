package SearchingAlgorithms;

import java.util.*;

//Given an array of numbers
//Place all the even numbers before odd numbers
//Preserve the order
public class EvenAndOdd {

    //O(n) and O(1)
    public void method(int[] arr){
        if(arr==null || arr.length<2) return;
        int n = arr.length;
        int odd = 0;
        for(int i=0;i<n;i++){
            int a = arr[i];
            if(a%2!=0) continue;
            swap(arr,odd++,i);
        }
    }

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void display(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        EvenAndOdd s = new EvenAndOdd();
        System.out.println("Please enter the length of the array");
        int n = in.nextInt();
        System.out.println("Please enter the contents of the array");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        s.method(arr);
        System.out.println("The members of the array after rearranging is ");
        s.display(arr);
        in.close();
    }
}
