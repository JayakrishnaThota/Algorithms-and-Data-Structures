package DynamicProgramming;
import java.util.*;
import java.lang.*;
//Given a number n, find the nth fibonacci number
public class fibonacciNumbers {
    //O(n) and O(1)
    public int fibonacci (int n) throws IllegalArgumentException{
        if(n<0) throw new IllegalArgumentException("Negative numbers not allowed");
        if(n==0) return 0;
        if(n==1) return 1;
        int a = 0, b = 1;
        int c = 0;
        for(int i=2;i<=n;i++){
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        fibonacciNumbers f = new fibonacciNumbers();
        System.out.println("Please enter the number for which you want to find the fibonacci series value");
        int n = in.nextInt();
        System.out.println("Fibonacci series value of "+n+" is "+f.fibonacci(n));
    }
}
