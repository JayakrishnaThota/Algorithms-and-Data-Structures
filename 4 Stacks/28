package Stacks;

import java.util.Stack;

public class RecursiveRemoval{
    //O(n) time and space
    public static void RecursiveRemoval(int[] arr){
        if(arr==null || arr.length==0) return ;
        Stack<Integer> stack = new Stack();
        int i = 0;
        while(i<arr.length){
            if(stack.isEmpty() || stack.peek()!=arr[i]){
                stack.push(arr[i]);
                i++;
            }
            else{
                while(i<arr.length && stack.peek()==arr[i]){
                    i++;
                }
                stack.pop();
            }
        }
        displayreverse(stack);
    }

    public static void displayreverse(Stack<Integer> stack){
        Stack<Integer> temp = new Stack<>();
        while(!stack.isEmpty()) temp.push(stack.pop());
        while(!temp.isEmpty()) System.out.println(temp.pop());
    }

    public static void main(String[] args) {
        int[] arr = {1,9,6,8,8,8,0,1,1,0,6,5};
        RecursiveRemoval(arr);
    }
}
