package Misc;

public class SeparateNegandPos {

    public static void helper(int[] arr){
        int n = arr.length;
        int i = 0;
        for(int j=0;j<n;j++){
            if(arr[j]<0) swap(arr,i++,j);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void display(int[] arr){
        for(int i=0;i<arr.length-1;i++)
            System.out.print(arr[i]+",");
        System.out.print(arr[arr.length-1]);
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int[] arr = {-5,3,2,-1,4,-8};
        helper(arr);
        display(arr);
    }

}
