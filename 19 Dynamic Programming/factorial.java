package DynamicProgramming;
import java.util.*;

public class Factorial {

    //O(n) time and O(1) space
    public int factorial(int n) throws IllegalArgumentException{
        if(n<0) throw new IllegalArgumentException("Negative numbers not allowed");
        if(n==0) return 1;
        int cur = 1;
        for(int i=2;i<=n;i++){
            cur*=i;
        }
        return cur;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number ");
        int n = in.nextInt();
        Factorial s = new Factorial();
        System.out.println("Factorial of the given number is "+s.factorial(n));
        in.close();
    }
}
