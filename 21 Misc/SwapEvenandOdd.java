package Misc;

import java.util.*;
public class SwapEvenandOddBits {
    public int swap(int number){
        int even = number&0xAA;
        int odd = number&0x55;
        even>>=1;
        odd<<=1;
        return (even|odd);
    }

    public static void main(String[] args) {
        SwapEvenandOddBits s = new SwapEvenandOddBits();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number");
        int n = in.nextInt();
        System.out.println("The result with swapped even and odd bits is ");
        System.out.println(s.swap(n));
        in.close();
    }
}
