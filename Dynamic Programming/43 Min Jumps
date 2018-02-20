package DynamicProgramming;

import java.util.Scanner;

public class MinJumps {
    //O(n) and O(1)
    public int minjumps(int[] arr){
        int n = arr.length;
        int curfar = 0, curmax = 0, jumps = 0;
        for(int i=0;i<n;i++){
            curfar = Math.max(curfar, i+arr[i]);
            if(curmax==i){
                curmax = curfar;
                jumps++;
            }
        }
        return jumps;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        MinJumps s = new MinJumps();
        System.out.println("Please enter the length and contents of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Minimum number of jumps required is"+s.minjumps(arr));
        in.close();
    }
}
