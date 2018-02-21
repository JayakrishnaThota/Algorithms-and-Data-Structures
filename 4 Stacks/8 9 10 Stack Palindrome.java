package Stacks;
import java.util.*;
public class StackPalindrome {
    //O(n) time and space
    private boolean isP(String s){
        if(s==null || s.length()==0) return true;
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(s.charAt(i)!='X') stack.push(s.charAt(i++));
        i++;
        while(!stack.isEmpty()){
            if(stack.pop()!=s.charAt(i++)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your input string");
        String s = in.nextLine();
        StackPalindrome sp = new StackPalindrome();
        System.out.println("Is the given string a palindrome "+sp.isP(s));
    }
}
