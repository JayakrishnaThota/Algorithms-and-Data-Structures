//Algorithms
//Create a stack
//For each character in the string,
//a) If it is a operand, output it
//b) If it is a right parantheses, pop the characters from the stack until the character is left parantheses or the stack is empty
//c) Else, pop and output the tokens from the stack until a lower priority or '(' or the stack is empty
//	push the current token
//pop the tokens until the stack is Empty

package stacks;

import java.util.Stack;

public class infixtopostfix {
	private static boolean isOperator(char c)
	{
	    return c == '+' || c == '-' || c == '*' || c == '/' || c == '^'
	            || c == '(' || c == ')';
	}

	private static boolean isLowerPrecedence(char op1, char op2)
	{
	    switch (op1)
	    {
	        case '+':
	        case '-':
	            return !(op2 == '+' || op2 == '-');

	        case '*':
	        case '/':
	            return op2 == '^' || op2 == '(';

	        case '^':
	            return op2 == '(';

	        case '(':
	            return true;

	        default:
	            return false;
	    }
	}

	public static String convertToPostfix(String infix)
	{
	    Stack<Character> stack = new Stack<Character>();
	    StringBuffer postfix = new StringBuffer(infix.length());
	    char c;

	    for (int i = 0; i < infix.length(); i++)
	    {
	        c = infix.charAt(i);

	        if (!isOperator(c))
	        {
	            postfix.append(c);
	        }

	        else
	        {
	            if (c == ')')
	            {

	                while (!stack.isEmpty() && stack.peek() != '(')
	                {
	                    postfix.append(stack.pop());
	                }
	                if (!stack.isEmpty())
	                {
	                    stack.pop();
	                }
	            }

	            else
	            {
	                if (!stack.isEmpty() && !isLowerPrecedence(c, stack.peek()))
	                {
	                    stack.push(c);
	                }
	                else
	                {
	                    while (!stack.isEmpty() && isLowerPrecedence(c, stack.peek()))
	                    {
	                        Character pop = stack.pop();
	                        if (c != '(')
	                        {
	                            postfix.append(pop);
	                        } else {
	                          c = pop;
	                        }
	                    }
	                    stack.push(c);
	                }

	            }
	        }
	    }
	    while (!stack.isEmpty()) {
	      postfix.append(stack.pop());
	    }
	    return postfix.toString();
	}

	public static void main(String[] args)
	{
	    System.out.println(convertToPostfix("A*B-(C+D)+E"));
	}
}
