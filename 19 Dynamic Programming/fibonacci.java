package DynamicProgramming;

import java.util.Scanner;

public class Fibonacci {
    //O(n) time and O(1) space
    //0 1
    public int fibonacci(int n) throws IllegalArgumentException{
        if(n<0) throw new IllegalArgumentException("Negative numbers not allowed");
        if(n==0) return 0;
        if(n==1) return 1;
        int a=0,b=1,c=a+b;
        for(int i=2;i<=n;i++){
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number ");
        int n = in.nextInt();
        Fibonacci s = new Fibonacci();
        System.out.println("Fibonacci of the given number is "+s.fibonacci(n));
        in.close();
    }
}
