package stacks;

import java.util.Stack;

public class postfixevaluation {
	public static int postfixevaluation(String s){
		Stack<Integer> stack = new Stack();
		for(char c:s.toCharArray()){
				if(c=='+'){
					int a = stack.pop();
					int b = stack.pop();
					stack.push(a+b);
				}
				else if(c=='-'){
					int a = stack.pop();
					int b = stack.pop();
					stack.push(b-a);
				}
				else if(c=='*'){
					int a = stack.pop();
					int b = stack.pop();
					stack.push(a*b);
				}
				else if(c=='/'){
					int a = stack.pop();
					int b = stack.pop();
					stack.push(b/a);
				}
				else{
					stack.push(Character.getNumericValue(c));
			}
		}
		return stack.pop();
	}
	private static boolean isOperator(char c)
	{
	    return c == '+' || c == '-' || c == '*' || c == '/' || c == '^'
	            || c == '(' || c == ')';
	}
	public static void main(String[] args){
		System.out.println(postfixevaluation("123*+5-"));
	}
}
