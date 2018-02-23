package Stacks;
import java.util.*;

public class InfixEvaluation {

    //O(n) time and space
    public int getValue(String expression){
        if(expression==null || expression.length()==0) return 0;
        Stack<Character> Operator = new Stack();
        Stack<Integer> Operand = new Stack<>();
        int digit = 0;
        for(int i=0;i<expression.length();i++){
            char c = expression.charAt(i);
            if(c==' ') continue;
            else if(Character.isDigit(c)){
                digit = c-'0';
                while(i+1<expression.length() && Character.isDigit(expression.charAt(i+1))){
                    digit = digit*10 + (expression.charAt(++i)-'0');
                }
                Operand.push(digit);
            }
            else if(isOpeator(c)){
                while(!Operator.isEmpty() && hasPrecedence(c, Operator.peek())){
                    Operand.push(applyOperation(Operator.pop(), Operand.pop(), Operand.pop()));
                }
                Operator.push(c);
            }
            else if(c=='('){
                Operator.push(c);
            }
            else if(c==')'){
                while(Operator.peek()!='('){
                    Operand.push(applyOperation(Operator.pop(), Operand.pop(), Operand.pop()));
                }
                Operator.pop();
            }
        }
        while(!Operator.isEmpty()){
            Operand.push(applyOperation(Operator.pop(), Operand.pop(), Operand.pop()));
        }
        return Operand.pop();
    }

    public boolean isOpeator(char c){
        return (c=='+' || c=='-' || c=='*' || c=='/');
    }

    public int applyOperation(char token, int a, int b){
        switch (token){
            case '+': return a+b;
            case '-': return b-a;
            case '*': return a*b;
            case '/': return b/a;
        }
        return 0;
    }

    public boolean hasPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        String expression = "100 * ( 2 + 12 ) / 14";
        InfixEvaluation i = new InfixEvaluation();
        System.out.println("The value of expression is "+i.getValue(expression));
    }
}
