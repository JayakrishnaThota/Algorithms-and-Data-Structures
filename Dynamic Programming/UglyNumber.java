package DynamicProgramming;

import java.util.Scanner;
//Given a number n, the task is to find n’th Ugly number.
//Ugly numbers are multiples of 2,3,5
public class UglyNumber {

    //O(n) time and space
    private int UglyNumber(int n) throws IllegalArgumentException{
        if(n<0) throw new IllegalArgumentException("Negative numbers not allowed");
        int[] dp = new int[n+1];
        dp[0] = 1;
        int ai = 0, bi = 0, ci = 0;
        int a = 2, b = 3, c = 5;
        for(int i=1;i<=n;i++){
            int min = Math.min(a,Math.min(b,c));
            dp[i] = min;
            if(min==a) a = 2*dp[++ai];
            else if(min==b) b = 3*dp[++bi];
            else if(min==c) c = 5*dp[++ci];
        }
        return dp[n];
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        UglyNumber f = new UglyNumber();
        System.out.println("Please enter the number for which you want to find the ugly series number");
        int n = in.nextInt();
        System.out.println("Ugly number of"+n+" is "+f.UglyNumber(n));
    }
}
